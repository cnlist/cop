package us.cnlist.cop.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.cnlist.cop.controller.async.Status;
import us.cnlist.cop.entity.AuthorityDao;
import us.cnlist.cop.entity.UserEntity;
import us.cnlist.cop.entity.UserProfileEntity;
import us.cnlist.cop.repository.AuthoritiesRepository;
import us.cnlist.cop.repository.UserProfileRepository;
import us.cnlist.cop.repository.UserRepository;
import us.cnlist.cop.services.UserManager;

@RestController
@Controller
public class UserController {
    private final UserRepository userRepository;
    private final AuthoritiesRepository authoritiesRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserManager userManager;
    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserController(UserRepository userRepository, AuthoritiesRepository authoritiesRepository, PasswordEncoder passwordEncoder, UserManager userManager, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.authoritiesRepository = authoritiesRepository;
        this.passwordEncoder = passwordEncoder;
        this.userManager = userManager;
        this.userProfileRepository = userProfileRepository;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Status register(@RequestBody UserEntity user, String password) {
        try {
            if (!isRegisterRequestValid(user, password)) {
                throw new IllegalArgumentException();
            }
            user.setPassword(passwordEncoder.encode(password));
            AuthorityDao authorityDao = new AuthorityDao();
            authorityDao.setAuthority(AuthorityDao.Role.USER.getValue());
            authorityDao.setUsername(user.getUsername());
            UserProfileEntity userProfileEntity = new UserProfileEntity();
            userProfileEntity.setUsername(user.getUsername());
            userRepository.save(user);
            authoritiesRepository.save(authorityDao);
            userProfileRepository.save(userProfileEntity);
            return Status.OK;
        } catch (Exception e) {
            return Status.ERROR;
        }

    }

    private boolean isRegisterRequestValid(UserEntity user, String password) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(password)) {
            return false;
        }
        if (userRepository.existsById(user.getUsername())) {
            return false;
        }
        return true;
    }

    @RequestMapping("/user_info")
    @ResponseBody
    public UserProfileEntity userInfo() {
        return userManager.getProfile();
    }

    @RequestMapping("/update_profile")
    public Status updateProfile(@RequestBody UserProfileEntity userProfileEntity) {
        try {
            if (!userManager.getLogin().equals(userProfileEntity.getUsername())) {
                throw new IllegalArgumentException();
            }
            userProfileRepository.save(userProfileEntity);
            return Status.OK;
        } catch (Exception e) {
            return Status.ERROR;
        }

    }


}
