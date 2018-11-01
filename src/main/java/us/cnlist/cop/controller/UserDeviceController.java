package us.cnlist.cop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.cnlist.cop.entity.UserDevice;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("udev")
public class UserDeviceController {

    @GetMapping(path = "/my")
    public @ResponseBody
    List<UserDevice> getUserDivices() {
        List<UserDevice> res = new ArrayList<>();

        return res;
    }


}
