package us.cnlist.cop.entity;

import com.smartgwt.client.data.Record;

import javax.persistence.*;
@Entity
public class UserDevice extends BelongsToUser{
    @Column
    private String userDeviceName;

    @JoinColumn(name = "id",table = "DEFAULT_DEVICE")
    private Integer defaultDeviceId;
    @Column
    private String deviceId;

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
}
