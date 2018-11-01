package us.cnlist.cop.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BelongsToUser extends StandardEntity{ //TODO попробовать переписать на интерфейс
    @Column
    private String userName;
}
