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



}
