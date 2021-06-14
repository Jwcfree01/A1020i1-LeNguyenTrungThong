package model.repository;

import model.bean.MatBang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepoImpl implements MatBangRepo{
    private BaseRepository baseRepository = new BaseRepository();

    private static final String SELECT_ALL = "select* from matbang\n" +
            "order by area";
    private static final String DELETE = "delete from matbang where id =?";
    private static final String CREATE = "insert into matbang (name_matbang, status_matbang, area, floor, type_matBang, price, start_date, end_date)\n" +
            "values (?,?,?,?,?,?,?,?);";
    private static final String SEARCH_FLOOR = "select * from matbang\n" +
            "where floor like ?";
    private static final String SEARCH_PRICE = "select * from matbang\n" +
            "where price like ?";
    @Override
    public List<MatBang> findAll() {
        List<MatBang> matBangList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            MatBang matBang = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_matbang");
                String status = resultSet.getString("status_matbang");
                int area = resultSet.getInt("area");
                int floor = resultSet.getInt("floor");
                String type = resultSet.getString("type_matBang");
                Double price = resultSet.getDouble("price");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");
                matBang = new MatBang(id, name, status, area, floor, type, price, startDate, endDate);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public void deleteMatBang(int id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createMatBang(MatBang matBang) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(CREATE);
            preparedStatement.setString(1, matBang.getName());
            preparedStatement.setString(2, matBang.getStatus());
            preparedStatement.setInt(3, matBang.getArea());
            preparedStatement.setInt(4, matBang.getFloor());
            preparedStatement.setString(5, matBang.getTypeMatBang());
            preparedStatement.setDouble(6, matBang.getPrice());
            preparedStatement.setString(7, matBang.getStartDate());
            preparedStatement.setString(8, matBang.getEndDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MatBang> searchSoTang(int soTang) {
        List<MatBang> matBangList = new ArrayList<>();
        MatBang matBang = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SEARCH_FLOOR);
            preparedStatement.setInt(1, soTang);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_matbang");
                String status = resultSet.getString("status_matbang");
                int area = resultSet.getInt("area");
                int floor = resultSet.getInt("floor");
                String type = resultSet.getString("type_matBang");
                Double price = resultSet.getDouble("price");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");
                matBang = new MatBang(id, name, status, area, floor, type, price, startDate, endDate);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public List<MatBang> searchPrice(double price) {
        List<MatBang> matBangList = new ArrayList<>();
        MatBang matBang = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SEARCH_PRICE);
            preparedStatement.setDouble(1, price);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_matbang");
                String status = resultSet.getString("status_matbang");
                int area = resultSet.getInt("area");
                int floor = resultSet.getInt("floor");
                String type = resultSet.getString("type_matBang");
                Double pricea = resultSet.getDouble("price");
                String startDate = resultSet.getString("start_date");
                String endDate = resultSet.getString("end_date");
                matBang = new MatBang(id, name, status, area, floor, type, pricea, startDate, endDate);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }
}
