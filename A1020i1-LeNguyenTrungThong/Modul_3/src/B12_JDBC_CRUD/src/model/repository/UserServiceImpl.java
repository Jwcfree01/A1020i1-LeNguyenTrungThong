package model.repository;

import model.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserServiceImpl implements UserRepository{
    private static Map<Integer, User> userMap = new TreeMap<>();
    static {
        userMap.put(1,  new User(1,"a", "iphone1", "qa"));
        userMap.put(2,  new User(2, "a", "iphone2", "qa"));
        userMap.put(3,  new User(3, "a", "iphone3", "qa"));
        userMap.put(4,  new User(4, "a", "iphone4", "qa"));
        userMap.put(5,  new User(5, "a", "iphone5", "qa"));
    }
    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
