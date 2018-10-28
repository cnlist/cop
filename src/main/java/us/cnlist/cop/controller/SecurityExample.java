package us.cnlist.cop.controller;

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
    public void register(@RequestBody UserDto user){
        UserDao userDao= new UserDao();
        userDao.setUsername(user.getUsername());
        userDao.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(userDao);
    }

}
