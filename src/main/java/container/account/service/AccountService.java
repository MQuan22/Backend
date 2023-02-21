package container.account.service;

import container.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccount();

    Optional<Account> getAccountById(Integer Id);
}
