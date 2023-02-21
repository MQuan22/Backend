package container.account.controller;

import container.account.service.AccountService;
import container.entity.Account;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("getAllAccount")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }

    @GetMapping("getAccountById")
    public Optional<Account> getAccountById(
            @Parameter(description = "Enter container.account Id") @RequestParam(name = "id") @Min(value = 2, message = "Id must be equal or greater than 1") Integer Id
    ) { return accountService.getAccountById(Id);}
}
