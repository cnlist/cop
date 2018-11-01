package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.UserDevice;

public interface UserDeviceRepository extends BelongsToUserRepository<UserDevice,Integer> {
}
