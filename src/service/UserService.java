package service;

import impl.MyException;
import model.User;

import java.util.Set;

public interface UserService {
    void addUser(User user);

    User searchById(int id) throws MyException;

    void deleteById(int id) throws MyException;

    Set<User> getAll();

}
