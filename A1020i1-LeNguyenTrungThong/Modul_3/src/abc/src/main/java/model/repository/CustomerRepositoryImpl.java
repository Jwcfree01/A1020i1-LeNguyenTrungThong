package model.repository;

import model.bean.customer.Customer;
import model.bean.employee.*;
import model.bean.service.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    //customer
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
        return row > 0;
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
    public void editCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("update customer set customer_type_id = ? , customer_name = ? , customer_birthday = ? , customer_gender = ? , \n" +
                            "customer_id_card = ? , customer_phone = ? , customer_email = ? , customer_address = ? \n" +
                            "where customer_id = ? ");
            preparedStatement.setString(1, customer.getCusTypeId());
            preparedStatement.setString(2, customer.getCusName());
            preparedStatement.setString(3, customer.getCusBirthDay());
            preparedStatement.setString(4, customer.getCusGender());
            preparedStatement.setString(5, customer.getCusIdCard());
            preparedStatement.setInt(6, customer.getCusPhone());
            preparedStatement.setString(7, customer.getCusEmail());
            preparedStatement.setString(8, customer.getCusAddress());
            preparedStatement.setInt(9, customer.getCusId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from customer\n" +
                            "where customer_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id_cus = resultSet.getInt("customer_id");
                String typeID = resultSet.getString("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                int phone = resultSet.getInt("customer_phone");
                String email = resultSet.getString("customer_email");
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
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int cus_type_id = resultSet.getInt("customer_type_id");
                String cus_type = "";
                switch (cus_type_id) {
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

    //service
    @Override
    public boolean createService(Service service) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into service (service_name, service_area, service_cost, " +
                            "service_max_people, rent_type_id, service_type_id, " +
                            "standard_room, description_other_convenience, poll_servicearea, number_of_floor)" +
                            " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, service.getName());
            preparedStatement.setInt(2, service.getArea());
            preparedStatement.setDouble(3, service.getCost());
            preparedStatement.setInt(4, service.getMaxPeople());
            preparedStatement.setInt(5, service.getRentTypeId());
            preparedStatement.setInt(6, service.getServiceTypeId());
            preparedStatement.setString(7, service.getStandardRoom());
            preparedStatement.setString(8, service.getDescription());
            preparedStatement.setInt(9, service.getPollArea());
            preparedStatement.setInt(10, service.getNumberOfFloor());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    //employee
    @Override
    public boolean createEmployee(Employee employee) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into employee (employee_name, employee_birthday, employee_id_card, " +
                            "employee_salary, employee_phone, employee_email, employee_address, " +
                            "position_id, education_degree_id, division_id, user_name)" +
                            " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, employee.getEmName());
            preparedStatement.setString(2, employee.getEmBirthDay());
            preparedStatement.setInt(3, employee.getEmIdCard());
            preparedStatement.setDouble(4, employee.getEmSalary());
            preparedStatement.setInt(5, employee.getEmPhone());
            preparedStatement.setString(6, employee.getEmEmail());
            preparedStatement.setString(7, employee.getEmAddress());
            preparedStatement.setInt(8, employee.getPosition().getIdPosition());
            preparedStatement.setInt(9, employee.getEducation_degree().getIdEducation());
            preparedStatement.setInt(10, employee.getDivision().getIdDivision());
            preparedStatement.setString(11, employee.getUserName());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public List<Employee> showListEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                int idCard = resultSet.getInt("employee_id_card");
                int salary = resultSet.getInt("employee_salary");
                int phone = resultSet.getInt("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                Position position = this.findPosition(positionId);
                int educationId = resultSet.getInt("education_degree_id");
                Education_degree educationDegree = this.findEducation(educationId);
                int divisionId = resultSet.getInt("division_id");
                Division division = this.findDivision(divisionId);
                String userName = resultSet.getString("user_name");
                employee = new Employee(id, name, birthday, idCard, salary, phone, email, address, position,
                        division, educationDegree, userName);
                employeeList.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("delete from employee \n" +
                            "where employee_id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Position findPosition(int id) {
        Position position = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from position\n" +
                            "where position_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idEm = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");
                position = new Position(idEm, name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return position;
    }

    @Override
    public void editEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("update employee\n" +
                            "set employee_name = ?, employee_birthday = ?, employee_id_card = ?, employee_salary = ?, " +
                            "employee_phone = ?, employee_email = ?, employee_address = ?, position_id = ?, " +
                            "education_degree_id = ?, division_id = ?, user_name = ?\n" +
                            " where employee_id = ?");
            preparedStatement.setString(1, employee.getEmName());
            preparedStatement.setString(2, employee.getEmBirthDay());
            preparedStatement.setInt(3, employee.getEmIdCard());
            preparedStatement.setDouble(4, employee.getEmSalary());
            preparedStatement.setInt(5, employee.getEmPhone());
            preparedStatement.setString(6, employee.getEmEmail());
            preparedStatement.setString(7, employee.getEmAddress());
            preparedStatement.setInt(8, employee.getPosition().getIdPosition());
            preparedStatement.setInt(9, employee.getEducation_degree().getIdEducation());
            preparedStatement.setInt(10, employee.getDivision().getIdDivision());
            preparedStatement.setString(11, employee.getUserName());
            preparedStatement.setInt(12, employee.getEmId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Division findDivision(int id) {
        Division division = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from division\n" +
                            "where division_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idDivision = resultSet.getInt("division_id");
                String divisionName = resultSet.getString("division_name");
                division = new Division(idDivision, divisionName);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return division;
    }

    @Override
    public Employee findByIdEmployee(int id) {
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from employee\n" +
                            "where employee_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idEm = resultSet.getInt("employee_id");
                String nameEm = resultSet.getString("employee_name");
                String birthdateEm = resultSet.getString("employee_birthday");
                int idCard = resultSet.getInt("employee_id_card");
                int salary = resultSet.getInt("employee_salary");
                int phoneEm = resultSet.getInt("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int positionId = resultSet.getInt("position_id");
                Position position = this.findPosition(positionId);
                int education = resultSet.getInt("education_degree_id");
                Education_degree educationDegree = this.findEducation(education);
                int division = resultSet.getInt("division_id");
                Division division1 = this.findDivision(division);
                String username = resultSet.getString("user_name");
                employee = new Employee(idEm, nameEm, birthdateEm, idCard, salary, phoneEm, email, address,
                        position, division1, educationDegree, username);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public Education_degree findEducation(int id) {
        Education_degree educationDegree = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("select * from education_degree\n" +
                            "where education_degree_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idEducation = resultSet.getInt("education_degree_id");
                String nameEducation = resultSet.getString("education_degree_name");
                educationDegree = new Education_degree(idEducation, nameEducation);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educationDegree;
    }


}
