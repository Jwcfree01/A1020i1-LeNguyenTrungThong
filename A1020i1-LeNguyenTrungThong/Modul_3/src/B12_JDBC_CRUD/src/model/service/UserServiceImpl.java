package model.service;

import model.bean.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> findAll() {
        return this.findAll();
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
