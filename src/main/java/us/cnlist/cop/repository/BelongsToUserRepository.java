package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;

public interface BelongsToUserRepository<T,ID> extends CrudRepository<T,ID> {

    Iterable<T> findAllByUsername(String username);
}
