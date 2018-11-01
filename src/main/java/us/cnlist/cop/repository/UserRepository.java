package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.DeviceGroup;
import us.cnlist.cop.entity.UserEntity;
import us.cnlist.cop.entity.UserProfileEntity;

public interface UserRepository extends BelongsToUserRepository<UserEntity>, CrudRepository<UserEntity,String>{
}
