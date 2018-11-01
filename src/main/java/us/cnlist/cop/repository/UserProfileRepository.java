package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.UserProfileEntity;


public interface UserProfileRepository extends CrudRepository<UserProfileEntity,String> {

}
