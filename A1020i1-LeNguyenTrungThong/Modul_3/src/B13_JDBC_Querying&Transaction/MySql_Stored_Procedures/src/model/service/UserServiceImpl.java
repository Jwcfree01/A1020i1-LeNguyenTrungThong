package model.service;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
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

    @Override
    public List<User> findAllUsers() {
        return this.userRepository.findAllUsers();
//        ee t thấy sai sai,m phải bỏ ở trong repository hoặc crud chớ ok
        // t không sử dụng thằng crud tới
//        v phải trong repository chứ
        // t,hì bây giờ t bỏ nè vì servlet của m sẽ gọi service
        // còn service sẽ gọi cho repo

    }

    @Override
    public void updateUser(int id, User user) {
        this.userRepository.updateUser(id, user);
    }
}
