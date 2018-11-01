package us.cnlist.cop.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import us.cnlist.cop.controller.async.Status;
import us.cnlist.cop.entity.DeviceGroup;
import us.cnlist.cop.repository.DeviceGroupRepository;
import us.cnlist.cop.services.UserManager;

@RestController
@RequestMapping("/device_group")
public class DeviceGroupController {
    private final UserManager userManager;
    private final DeviceGroupRepository deviceGroupRepository;

    public DeviceGroupController(UserManager userManager, DeviceGroupRepository deviceGroupRepository) {
        this.userManager = userManager;
        this.deviceGroupRepository = deviceGroupRepository;
    }

    @PostMapping("/add")
    public Status add(@RequestBody DeviceGroup group) {
        if (StringUtils.isBlank(group.getUsername())) {
            group.setUsername(userManager.getLogin());
        } else if (!userManager.contains(group.getUsername())) {
            return Status.ERROR;
        }
        deviceGroupRepository.save(group);
        return Status.OK;
    }

    @GetMapping("getAll")
    public Iterable<DeviceGroup> getAll() {
        return deviceGroupRepository.findAllByUsername(userManager.getLogin());
    }
}
