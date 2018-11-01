package us.cnlist.cop.repository;

public interface BelongsToUserRepository<T> {

    Iterable<T> findAllByUsername(String username);
}
