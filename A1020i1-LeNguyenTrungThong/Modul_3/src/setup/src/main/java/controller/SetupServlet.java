package controller;

import common.Validate;
import model.bean.Customer;
import model.service.Service;
import model.service.ServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SetupServlet", urlPatterns = "")
public class SetupServlet extends HttpServlet {
    Service service = new ServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null){
            action = "";
        }

        switch (action){
            case "":
                showCustomer(request,response);
                break;
            case "delete" :
                 deleteCustomer(request, response);
            break;
            case "search":
                searchCustomer(request,response);
                break;
            case "create":
                showFormCreate(request,response);
                break;
            default:
                showCustomer(request,response);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("create.jsp");
            dd.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Customer> customerList = this.service.searchCustomer(name);
        request.setAttribute("showCustomer", customerList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        this.service.deleteCustomer(id);
        showCustomer(request,response);
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showCustomer", this.service.findAll());
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String cus_type = request.getParameter("cus_type");
        String name = request.getParameter("name");
        String validateName = Validate.nameCustomer(name);
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String validateGender = Validate.gender(gender);
        String cmnd = request.getParameter("cmnd");
        String validateIdCard = Validate.cmnd(cmnd);
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(cus_type, name, birthday, gender, cmnd, phone, email, address);
        try {
            if (validateName == null && validateIdCard == null){
                this.service.createCustomer(customer);
                showCustomer(request,response);
            }else {
                String msg = "err";
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("create.jsp").forward(request,response);
            }
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
