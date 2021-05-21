package Controller;

import Model.Bean.Customer;
import Model.Service.CustomerService;
import Model.Service.CustomerServiceImpl;

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
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                break;
            default:
                loadList(request,response);
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
            case "create":
                response.sendRedirect("Customer/create.jsp");
                break;
            case "showCus":
                listCustomer(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            default:
                loadList(request,response);
                break;
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customerEdit = customerService.findById(id);
        request.setAttribute("customer", customerEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("Customer/home.jsp");
            dd.forward(request,response);
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
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(cus_type, name, birthday, gender, cmnd, phone, email, address);
        this.customerService.createCustomer(customer);
        listCustomer(request,response);
        System.out.println(cus_type);
        System.out.println(name);
        System.out.println(birthday);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showCustomer", this.customerService.showCustomer());
        try {
            request.getRequestDispatcher("Customer/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
