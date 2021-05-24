package model.repository;

import model.bean.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public boolean createCustomer(Customer customer) {
    int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into customer (customer_type_id, customer_name, customer_birthday," +
                            "customer_gender, customer_id_card, customer_phone, customer_email, customer_address)\n" +
                            " values (?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, customer.getCusTypeId());
            preparedStatement.setString(2, customer.getCusName());
            preparedStatement.setString(3, customer.getCusBirthDay());
            preparedStatement.setString(4, customer.getCusGender());
            preparedStatement.setString(5, customer.getCusIdCard());
            preparedStatement.setInt(6, customer.getCusPhone());
            preparedStatement.setString(7, customer.getCusEmail());
            preparedStatement.setString(8, customer.getCusAddress());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public void deleteCustomer(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("delete from customer \n" +
                            "where customer_id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void editCustomer(int id) {

    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from customer\n" +
                            "where customer_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id_cus = resultSet.getInt("customer_id");
                String typeID = resultSet.getString("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                int phone = resultSet.getInt("customer_phone");
                String email= resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id_cus, typeID, name, birthday, gender, idCard, phone, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> showCustomer() {
        List<Customer> listCustomers = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                int cus_type_id = resultSet.getInt("customer_type_id");
                String cus_type = "";
                switch (cus_type_id){
                    case 1:
                        cus_type = "Diamond";
                        break;
                    case 2:
                        cus_type = "Platinum";
                        break;
                    case 3:
                        cus_type = "Gold";
                        break;
                    case 4:
                        cus_type = "Silver";
                        break;
                    default:
                        cus_type = "Member";
                        break;
                }
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String cmnd = resultSet.getString("customer_id_card");
                int phone = resultSet.getInt("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, cus_type, name, birthday, gender, cmnd, phone, email, address);
                listCustomers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listCustomers;
    }
}
