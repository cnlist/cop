package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;
import us.cnlist.cop.entity.AuthorityDao;

public interface AuthoritiesRepository extends CrudRepository<AuthorityDao, String> {
}
