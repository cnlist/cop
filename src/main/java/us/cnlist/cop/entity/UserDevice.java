package us.cnlist.cop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class UserDevice extends BelongsToUser {
    @Column
    private String userDeviceName;

    @JoinColumn(name = "id", table = "DEFAULT_DEVICE")
    private Integer defaultDeviceId;
    @Column
    private String deviceId;
    @JoinColumn(name = "id", table = "DEVICE_GROUP")
    private Integer groupId;
    public String getUserDeviceName() {
        return userDeviceName;
    }

    public void setUserDeviceName(String userDeviceName) {
        this.userDeviceName = userDeviceName;
    }

    public Integer getDefaultDeviceId() {
        return defaultDeviceId;
    }

    public void setDefaultDeviceId(Integer defaultDeviceId) {
        this.defaultDeviceId = defaultDeviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
