package us.cnlist.cop.repository;

import java.util.List;

public interface BelongsToUserRepository<T> {

    List<T> findAllByUsername(String username);
}
