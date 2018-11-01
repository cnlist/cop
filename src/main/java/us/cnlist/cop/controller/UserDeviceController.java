package us.cnlist.cop.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.cnlist.cop.controller.async.Status;
import us.cnlist.cop.entity.UserDevice;
import us.cnlist.cop.repository.UserDeviceRepository;
import us.cnlist.cop.services.UserManager;

import java.util.List;

@Controller
@RequestMapping("/udev")
public class UserDeviceController {
    private final UserManager userManager;
    private final UserDeviceRepository userDeviceRepository;

    public UserDeviceController(UserManager userManager, UserDeviceRepository userDeviceRepository) {
        this.userManager = userManager;
        this.userDeviceRepository = userDeviceRepository;
    }

    @PostMapping("/add")
    public @ResponseBody
    Status add(@RequestBody UserDevice device) {
        if (StringUtils.isBlank(device.getUsername())) {
            device.setUsername(userManager.getLogin());
        } else if (!userManager.contains(device)) {
            return Status.ERROR;
        }
        userDeviceRepository.save(device);
        return Status.OK;
    }

    @GetMapping(path = "/my")
    public @ResponseBody
    List<UserDevice> getUserDevices() {
        return userDeviceRepository.findAllByUsername(userManager.getLogin());
    }


    private UserDevice createFakeDevice(String name) {
        UserDevice dev = new UserDevice();
        dev.setUserDeviceName(name);
        return dev;
    }

}
