package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.UserEntity;

public interface UserRepository extends BelongsToUserRepository<UserEntity,String> {
}
