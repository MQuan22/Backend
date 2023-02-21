package container.account.service.impl;

import container.account.service.AccountService;
import container.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import container.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
    @Override
    public Optional<Account> getAccountById(Integer Id) { return accountRepository.findById(Id); }

}
