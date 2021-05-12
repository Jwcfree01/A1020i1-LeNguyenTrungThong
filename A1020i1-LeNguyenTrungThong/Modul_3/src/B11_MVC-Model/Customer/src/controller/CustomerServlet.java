package controller;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.CustomerRepositoryImpl;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/","/customer"})
public class CustomerServlet extends HttpServlet {

    CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String name = request.getParameter("nameCus");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
//
//        Customer cus1 = new Customer(name, email, address);
//        String msg = "";
//        if (this.customerService.save(cus1)){
//            msg = "ok";
//            request.setAttribute("msg", msg);
//            request.setAttribute("findCus", this.customerService.findAll());
//            request.getRequestDispatcher("list.jsp").forward(request,response);
//        }else {
//            msg = "invalid data";
//            request.setAttribute("msg", msg);
//            request.getRequestDispatcher("create.jsp").forward(request, response);
//        }

        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                addNewCustomer(request,response);
                break;
            case "back":
                loadList(request,response);
                break;
            case "remove":
                removeCustomer(request,response);
                loadList(request,response);
            case "edit":
                eidtCustomer(request,response);
                loadList(request,response);
                break;
            default:
                loadList(request,response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
//                response.sendRedirect("create.jsp");
                request.getRequestDispatcher("create.jsp").forward(request,response);
                break;
            case "back":
                loadList(request,response);
                break;
            case "remove":
                removeCustomer(request,response);
                loadList(request,response);
                break;
            case "edit":
                eidtCustomer(request,response);
                loadList(request,response);
                break;
            default:
                loadList(request,response);
                break;
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("findCus", this.customerService.findAll());
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void viewCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }
    private void addNewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("idCus"));
        String name = request.getParameter("nameCus");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String error = "invalid";
        Customer cus1 = new Customer(id, name, email, address);
        if (this.customerService.save(cus1)){
            request.setAttribute("findCus", this.customerService.findAll());
            request.getRequestDispatcher("list.jsp").forward(request,response);
        }else {
            error = "invalid data";
            request.setAttribute("err", error);
            request.getRequestDispatcher("create.jsp").forward(request,response);
        }
    }

    //remove customer
    private void removeCustomer(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt("id");
        customerService.remove(id);
    }

    private void eidtCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("update.jsp");
    }
}
