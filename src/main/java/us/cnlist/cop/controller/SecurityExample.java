package us.cnlist.cop.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityExample {
    @RequestMapping("/user_info")
    @ResponseBody
    public String  userInfo() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }

}
