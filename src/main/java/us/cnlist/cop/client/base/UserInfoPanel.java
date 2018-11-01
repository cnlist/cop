package us.cnlist.cop.client.base;

import com.smartgwt.client.widgets.Label;
import us.cnlist.cop.controller.async.SecurityControllerAsync;
import us.cnlist.cop.entity.UserProfileEntity;

public class UserInfoPanel extends Label {

    private static UserInfoPanel instance;
    private UserProfileEntity userProfile;

    private UserInfoPanel() {
        loadProfile();
    }

    public static UserInfoPanel getInstance() {
        if (instance == null) {
            instance = new UserInfoPanel();
        }
        return instance;
    }

    public UserProfileEntity getUserProfile() {
        return userProfile;
    }

    private void loadProfile() {
        SecurityControllerAsync.instance.getUserProfile(e -> {
            userProfile = e;
            setContents(e.getFirstName() + " " + e.getLastName());
        });
    }
}
