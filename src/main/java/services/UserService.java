package services;

import container.entity.User;
import interfaces.IBaseService;
import interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.List;
@Service
public class UserService implements IUserService, IBaseService<User> {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean existsEmailOrUsername(String username, String email){
        return userRepository.existsByUsernameOrEmail(username,email);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public void create(User model) {

    }

    @Override
    public void delete(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public void grantAdmin(String username) {

    }

    @Override
    public void revokeAdmin(String username) {

    }
}
