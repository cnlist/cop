package us.cnlist.cop.repository;

import org.springframework.data.repository.CrudRepository;

public interface BelongsToUserRepository<T> {

    Iterable<T> findAllByUsername(String username);
}
