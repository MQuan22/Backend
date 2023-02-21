package container.repository;

import container.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    
    @Query("SELECT t FROM Account t")
    List<Account> findAll();

    //    @Query("SELECT t FROM Account t WHERE t.id = ?1")
    Optional<Account> findById(Integer Id);
}
