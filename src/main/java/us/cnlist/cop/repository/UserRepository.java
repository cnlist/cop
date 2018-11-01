package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.UserDao;

public interface UserRepository extends CrudRepository<UserDao,String> {
}
