package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.DeviceGroup;

public interface DeviceGroupRepository extends BelongsToUserRepository<DeviceGroup>, CrudRepository<DeviceGroup, Integer> {
}
