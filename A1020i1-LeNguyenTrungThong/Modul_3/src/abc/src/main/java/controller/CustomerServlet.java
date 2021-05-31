package controller;

import common.Validate;
import model.bean.customer.Customer;
import model.bean.employee.Division;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.bean.service.Service;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", urlPatterns = "")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "createService":
                createService(request, response);
                break;
            case "createEmployee":
                createEmployee(request, response);
                break;
            case "editEmployee":
                editEmployee(request,response);
                break;
            default:
                loadList(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                response.sendRedirect("customer/create.jsp");
                break;
            case "showCus":
                listCustomer(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                deleteCus(request, response);
                break;
            case "showService":
                showListService(request,response);
                break;
            case "createService":
                showCreateService(request, response);
                break;
            case "createEmployee":
                showCreateEmployee(request, response);
                break;
            case "listEmployee":
                showListEmployee(request, response);
                break;
            case "createContract":
                showFormContract(request, response);
                break;
            case "deleteEmployee":
                deleteEmployee(request,response);
                break;
            case "editEmployee":
                showFormEditEmployee(request,response);
                break;
            default:
                loadList(request, response);
                break;
        }
    }

    //contract
    private void showFormContract(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("contract/createContract.jsp");
            dd.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    //employee
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.deleteEmployee(id);
        showListEmployee(request,response);
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showEmployee", this.customerService.showListEmployee());
        try {
            request.getRequestDispatcher("employee/listEmployee.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("employeeName");
        String birthday = request.getParameter("employeeBirthday");
        int id = Integer.parseInt(request.getParameter("idCard"));
        double salary = Double.parseDouble(request.getParameter("salary"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition=Integer.parseInt(request.getParameter("position"));
        int idEducation = Integer.parseInt(request.getParameter("educationDegree"));
        int idDivision =Integer.parseInt(request.getParameter("division"));
        String username = request.getParameter("username");
        Employee employee = new Employee(name, birthday, id, salary, phone, email, address,
                customerService.findPosition(idPosition), this.customerService.findDivision(idDivision),
                this.customerService.findEducation(idEducation), username);
        this.customerService.createEmployee(employee);
        showListEmployee(request, response);
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("employee/createEmployee.jsp");
            dd.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void showFormEditEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Employee employee = this.customerService.findByIdEmployee(id);
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/editEmployee.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idEm = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int idCard = Integer.parseInt(request.getParameter("idCard"));
        double salary = Double.parseDouble(request.getParameter("salary"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int division = Integer.parseInt(request.getParameter("division"));
        int education = Integer.parseInt(request.getParameter("education"));
        String username = request.getParameter("username");
        System.out.println(name);
        System.out.println(username);
        Employee employee = new Employee(idEm, name, birthday, idCard, salary,phone, email, address,
                this.customerService.findPosition(position), this.customerService.findDivision(division),
                this.customerService.findEducation(education), username);
        this.customerService.editEmployee(employee);
        this.showListEmployee(request,response);
    }

    //service
    private void showCreateService(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("service/createService.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {
        String nameService = request.getParameter("serviceName");
        int area = Integer.parseInt(request.getParameter("serviceArea"));
        int cost = Integer.parseInt(request.getParameter("serviceCost"));
        int maxPeople = Integer.parseInt(request.getParameter("serviceMaxPeople"));
        int rentTypeId = Integer.parseInt(request.getParameter("rentTypeName"));
        int serviceTypeId = Integer.parseInt(request.getParameter("serviceTypeName"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("descriptionOtherConvenience");
        int pollArea = Integer.parseInt(request.getParameter("pollArea"));
        int numberOfFloor = Integer.parseInt(request.getParameter("numberOfFloor"));
        System.out.println(nameService);
        System.out.println(cost);
        Service service = new Service(nameService, area, cost, maxPeople, rentTypeId, serviceTypeId,
                standardRoom, description, pollArea, numberOfFloor);
        this.customerService.createService(service);
        showListService(request, response);
    }

    private void showListService(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showService", this.customerService.showService());
        try {
            request.getRequestDispatcher("service/listService.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    //customer
    private void deleteCus(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.deleteCustomer(id);
        listCustomer(request, response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customerEdit = customerService.findById(id);
        request.setAttribute("customer", customerEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("customer/home.jsp");
            dd.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String cus_type = request.getParameter("cus_type");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String cmnd = request.getParameter("cmnd");
        String cmndValidate = Validate.cmnd(cmnd);
        int phone = Integer.parseInt(request.getParameter("phone"));
        String phone1 = phone+"";
        String phoneValidate = Validate.phone(phone1);
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(cus_type, name, birthday, gender, cmndValidate, phone, email, address);
        this.customerService.createCustomer(customer);
        listCustomer(request, response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showCustomer", this.customerService.showCustomer());
        try {
            request.getRequestDispatcher("customer/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int cusId = Integer.parseInt(request.getParameter("id"));
        String cus_type = request.getParameter("cus_type");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String cmnd = request.getParameter("cmnd");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        System.out.println(cusId);
        Customer customer = new Customer(cusId, cus_type, name, birthday, gender, cmnd, phone, email, address);
        this.customerService.editCustomer(customer);
        listCustomer(request, response);
    }
}
