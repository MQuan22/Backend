package repositories;

import container.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    Boolean existsByUsernameOrEmail(String username, String email);

    @Query("SELECT DISTINCT u " +
            "FROM User u " +
            "LEFT OUTER JOIN u.courses " +
            "WHERE lower(u.name) like ?1" +
            "OR lower(u.email) like ?2")
    List<User> search(String keyword);
}
