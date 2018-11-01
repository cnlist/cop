package us.cnlist.cop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DeviceGroup extends BelongsToUser {

    @Column
    private Integer parentId;
    @Column
    private String name;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
