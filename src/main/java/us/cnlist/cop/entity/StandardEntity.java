package us.cnlist.cop.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public abstract class StandardEntity {
    @Id
    @GeneratedValue(generator = "seq_ddev")
    @SequenceGenerator(name = "seq_ddev", sequenceName = "seq_ddev", allocationSize = 1)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
