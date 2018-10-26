package us.cnlist.cop.entity;

import us.cnlist.cop.entity.converter.DeviceTypeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DEFAULT_DEVICE")
public class DefaultDevice implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private Date created;
    private DeviceType type;

    public DefaultDevice() {
    }

    @Id
    @GeneratedValue(generator = "seq_ddev")
    @SequenceGenerator(name = "seq_ddev", sequenceName = "seq_ddev", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "device_name", length = 1024)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", length = 2048)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "created")
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "device_type")
    @Convert(converter = DeviceTypeConverter.class)
    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }
}
