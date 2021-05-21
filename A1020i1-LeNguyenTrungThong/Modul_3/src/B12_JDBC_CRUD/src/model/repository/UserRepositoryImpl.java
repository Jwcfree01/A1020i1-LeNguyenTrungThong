package model.repository;

import model.bean.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserRepositoryImpl implements UserRepository{
    private static Map<Integer, User> userMap = new TreeMap<>();
//    static {
//        userMap.put(1,  new User(1,"a", "iphone1", "qa"));
//        userMap.put(2,  new User(2, "a", "iphone2", "qa"));
//        userMap.put(3,  new User(3, "a", "iphone3", "qa"));
//        userMap.put(4,  new User(4, "a", "iphone4", "qa"));
//        userMap.put(5,  new User(5, "a", "iphone5", "qa"));
//    }
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select id, `name`, email, country\n" +
                    "from user");
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean addUser(User user) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into user (`name`, email, country)\n" +
                            "values (?, ?, ?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public void editUser(User user) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("update user\n" +
                            "set name = ?, email = ?, country = ?\n" +
                            "where id = ?");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setString(4, user.getId()+"");
            row = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("delete from user\n" +
                    "where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        userMap.remove(id);
    }

    @Override
    public User findId(int id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from user\n" +
                    "                    where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User( name, email, country);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
        return user;
    }

    @Override
    public User search(String search) {
        List<String> stringList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from user\n" +
                            "        where `name` Like concat ('%',?,'%')");
            preparedStatement.setString(1,search);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String abc = resultSet.getString("name");
                stringList.add(abc);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return (User) stringList;

    }
}
