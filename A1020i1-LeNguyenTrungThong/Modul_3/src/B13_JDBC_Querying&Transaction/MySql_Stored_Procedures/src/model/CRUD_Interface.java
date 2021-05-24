package model;

import model.bean.User;

import java.util.List;

public interface CRUD_Interface {
    List<User> findAll();
    boolean addUser(User user);
    void editUser(User user);
    void deleteUser(int id);
    User findId(int id);
    User search(String search);

    List<User> findAllUsers();
    void updateUser(int id, User user);
}
