package us.cnlist.cop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.cnlist.cop.entity.UserProfileEntity;
import us.cnlist.cop.pgu.mos.api.GetCountersResponse;
import us.cnlist.cop.pgu.mos.api.PguApi;
import us.cnlist.cop.services.UserManager;

@RestController
public class SendWaterCounterController {
    @Autowired
    PguApi pguApi;

    @Autowired
    UserManager userManager;

    @RequestMapping("/sendWaterCounterInfo")
    public void test(Integer hotCount, Integer coldCount) {
        UserProfileEntity userProfileEntity = userManager.getProfile();
        String auth = pguApi.auth(userProfileEntity.getPhoneNumber(), userProfileEntity.getPguPassword());
        String flatId = pguApi.getFlatId(auth);
        GetCountersResponse.Counters[] counters = pguApi.getCounters(auth, flatId);
        GetCountersResponse.Counters cold = new GetCountersResponse.Counters();
        GetCountersResponse.Counters hot = new GetCountersResponse.Counters();
        for (GetCountersResponse.Counters c : counters
        ) {
            if (c.getType().equals("1")) {
                cold = c;
            } else if (c.getType().equals("2")) {
                hot = c;
            }
        }
        pguApi.postCountersValue(flatId, cold.getCounterId(), 250, hot.getCounterId(), 220, auth);

    }
}
