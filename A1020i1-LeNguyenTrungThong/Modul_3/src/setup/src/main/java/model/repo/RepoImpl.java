package model.repo;

import model.bean.CusType;
import model.bean.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepoImpl implements Repo {
    private BaseRepository baseRepository = new BaseRepository();

    private static final String SELECT_CUS = "select customer_id, customer_type_name, customer_name, customer_birthday, " +
            "customer_gender, customer_id_card, customer_phone, customer_email, customer_address\n" +
            "from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id;";

    private static final String FIND_ID = "select customer_id, customer_type_name, customer_name, customer_birthday, " +
            "customer_gender, customer_id_card, customer_phone, customer_email, customer_address\n" +
            "from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id\n" +
            "where customer_id = ?";

    private static final String DELETE = "delete from customer where customer_id =?";

    private static final String SEARCH = "select customer_id, customer_type_name, customer_name, customer_birthday, customer_gender, customer_id_card, \n" +
            "customer_phone, customer_email, customer_address\n" +
            "from customer left join customer_type on customer_type.customer_type_id = customer.customer_type_id\n" +
            "where customer_name like '%' ? '%'";

    private static final String UPDATE = "update customer\n" +
            "set customer_type_name = ?, customer_name = ?, customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ?\n" +
            "where customer_id = ?";
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_CUS);
            Customer customer = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String nameTypeId = resultSet.getString("customer_type_name");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, nameTypeId, name, birthday, gender, idCard, phone, email, address);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(FIND_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id_cus = resultSet.getInt("customer_id");
                String typeID = resultSet.getString("customer_type_name");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id_cus, typeID, name, birthday, gender, idCard, phone, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void deleteCustomer(int id) {
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
    public void updateCustomer(int id, Customer customer) {
//        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(
//                    ""
//            );
//            preparedStatement.setInt(1, customer.getCustomerType());
//            preparedStatement.setString(2, customer.getCustomerName());
//            preparedStatement.setDate(3, customer.getCustomerBirthday());
//            preparedStatement.setBoolean(4, customer.isCustomerGender());
//            preparedStatement.setString(5, customer.getCustomerIdCard());
//            preparedStatement.setString(6, customer.getCustomerPhone());
//            preparedStatement.setString(7, customer.getCustomerEmail());
//            preparedStatement.setString(8, customer.getCustomerAddress());
//            preparedStatement.setInt(9, id);
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(
                    "insert into customer (customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address)" +
                            "values (?,?,?,?,?,?,?,?);"
            );
            preparedStatement.setString(1, customer.getCustomerTypeId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerBirthday());
            preparedStatement.setString(4, customer.isCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerAddress());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SEARCH);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String nameTypeId = resultSet.getString("customer_type_name");
                String nameabc = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, nameTypeId, nameabc, birthday, gender, idCard, phone, email, address);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    @Override
    public CusType findCusType(int id) {
        CusType cusType = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from customer_type\n" +
                            "where customer_type_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idCusType = resultSet.getInt("customer_type_id");
                String nameCusType = resultSet.getString("customer_type_name");
                cusType = new CusType(idCusType, nameCusType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cusType;
    }
}
