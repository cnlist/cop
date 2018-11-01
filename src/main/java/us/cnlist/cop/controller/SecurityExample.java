package us.cnlist.cop.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.cnlist.cop.entity.AuthorityDao;
import us.cnlist.cop.entity.UserEntity;
import us.cnlist.cop.repository.AuthoritiesRepository;
import us.cnlist.cop.repository.UserRepository;

@RestController
@Controller
public class SecurityExample {
    private final UserRepository userRepository;
    private final AuthoritiesRepository authoritiesRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SecurityExample(UserRepository userRepository, AuthoritiesRepository authoritiesRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authoritiesRepository = authoritiesRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @RequestMapping("/user_info")
    @ResponseBody
    public String userInfo() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public HttpStatus register(@RequestBody UserEntity user, String password) {
        if (!isRegisterRequestValid(user)) {
            return HttpStatus.BAD_REQUEST;
        }
        user.setPassword(passwordEncoder.encode(password));
        AuthorityDao authorityDao= new AuthorityDao();
        authorityDao.setAuthority(AuthorityDao.Role.USER.getValue());
        authorityDao.setUsername(user.getUsername());
        userRepository.save(user);
        authoritiesRepository.save(authorityDao);
        return HttpStatus.OK;
    }

    private boolean isRegisterRequestValid(UserEntity user) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return false;
        }
        if (userRepository.existsById(user.getUsername())) {
            return false;
        }
        return true;
    }

}
