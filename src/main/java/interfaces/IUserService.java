package interfaces;

import container.entity.User;

import java.util.List;

public interface IUserService{
    public User findUserByEmail(String email);

    public void grantAdmin(String username);
    public void revokeAdmin(String username);
}
