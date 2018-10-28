package us.cnlist.cop.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.cnlist.cop.dto.UserDto;
import us.cnlist.cop.entity.UserDao;
import us.cnlist.cop.repository.UserRepository;

@RestController
@Controller
public class SecurityExample {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SecurityExample(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @RequestMapping("/user_info")
    @ResponseBody
    public String  userInfo() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public HttpStatus register(@RequestBody UserDto user){
        if(!isRegisterRequestValid(user)){
            return HttpStatus.BAD_REQUEST;
        }
        UserDao userDao= new UserDao();
        userDao.setUsername(user.getUsername());
        userDao.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(userDao);
        return HttpStatus.OK;
    }

    private boolean isRegisterRequestValid(UserDto user){
        if(StringUtils.isBlank(user.getUsername())||StringUtils.isBlank(user.getPassword())){
            return false;
        }
        if(userRepository.existsById(user.getUsername())){
            return false;
        }
        return true;
    }

}
