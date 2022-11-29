package impl;

import dao.UserDao;
import model.User;
import service.UserService;

import java.util.Iterator;
import java.util.Set;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User searchById(int id) throws MyException {
        for (User u : userDao.getUsers()) {
            if (u.getId() == id) {
                return u;
            }
        }
        throw new MyException("not have user with id: " + id);
    }

    @Override
    public void deleteById(int id) {
        Iterator<User> iterator = userDao.getUsers().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }

    }

    @Override
    public Set<User> getAll() {
        return userDao.getUsers();
    }
}
