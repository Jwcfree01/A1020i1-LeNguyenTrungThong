package model;

import model.bean.User;

import java.util.List;

public interface CRUD_Interface {
    List<User> findAll();
    boolean addUser(User user);
    void editUser(User user);
    void deleteUser(int id);
}
