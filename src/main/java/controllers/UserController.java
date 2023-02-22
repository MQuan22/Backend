package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<?> existUsernameOrEmail(@RequestParam(name="username",required = true) String username
            ,@RequestParam(name = "email",required = true) String email){
        boolean result = userService.existsEmailOrUsername(username,email);
        return ResponseEntity.ok(result);
    }
}
