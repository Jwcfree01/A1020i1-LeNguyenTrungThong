package model.service;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public boolean addUser(User user) {
        return this.userRepository.addUser(user);
    }

    @Override
    public void editUser(User user) {
        this.userRepository.editUser(user);
    }

    @Override
    public void deleteUser(int id) {
        this.userRepository.deleteUser(id);
    }

    @Override
    public User findId(int id) {
        return this.userRepository.findId(id);
    }

    @Override
    public User search(String search) {
        return null;
    }
}
