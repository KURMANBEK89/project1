package dao;

import model.User;

import java.util.HashSet;
import java.util.Set;

public class UserDao {
    private Set<User> users = new HashSet<>();

    public UserDao() {
        this.users = users;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
