package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.DeviceGroup;
import us.cnlist.cop.entity.UserProfileEntity;


public interface UserProfileRepository extends BelongsToUserRepository<UserProfileEntity>, CrudRepository<UserProfileEntity, String> {

}
