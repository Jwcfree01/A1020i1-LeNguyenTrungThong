package controller;

import model.bean.customer;
import model.repository_db.customerRepository;
import model.repository_db.customerRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "testQLKHServlet", urlPatterns = {"/customer", "/"})
public class testQLKHServlet extends HttpServlet {

    customerRepository customerRepository = new customerRepositoryImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nameCus");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        customer cus1 = new customer(name, email, address);
        String msg = "";
        if (this.customerRepository.saveCustomer(cus1)){
            msg = "ok";
            request.setAttribute("msg", msg);
            request.setAttribute("findCus", this.customerRepository.findAll());
            request.getRequestDispatcher("listCus.jsp").forward(request,response);
        }else {
            msg = "invalid data";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("create.jsp").forward(request, response);
        }

        //remove
        int idRemove = Integer.parseInt(request.getParameter("removeCus"));
        customerRepository.removeCus(idRemove);
        request.setAttribute("findCus", this.customerRepository.findAll());
        request.getRequestDispatcher("listCus.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == "" || action == null){
            request.setAttribute("findCus", this.customerRepository.findAll());
            request.getRequestDispatcher("listCus.jsp").forward(request,response);
        }
        switch (action){
            case "create":
                response.sendRedirect("create.jsp");
                break;
            case "remove":
                response.sendRedirect("remove.jsp");
            default:
//                request.setAttribute("findCus", this.customerRepository.findAll());
//                request.getRequestDispatcher("listCus.jsp").forward(request,response);
                break;
        }
    }
}
