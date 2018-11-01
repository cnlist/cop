package us.cnlist.cop.entity;

import javax.persistence.*;

@Entity
public class DeviceGroup extends BelongsToUser{

    @Column
    private Integer parentId;
    @Column
    private String name;

}
