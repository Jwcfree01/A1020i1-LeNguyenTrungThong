package com.codegym.controller;

import com.codegym.model.bean.customer;
import com.codegym.service.customerService;
import com.codegym.service.customerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QLKHServlet", urlPatterns = {"", "/customer"})
public class QLKHServlet extends HttpServlet {
    customerService customerService = new customerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameCus = request.getParameter("nameCus");
        String emailCus = request.getParameter("emailCus");
        String addressCus = request.getParameter("addressCus");

        customer cus = new customer(nameCus, emailCus, addressCus);
        request.setAttribute("cus", cus);
        customerService.save(cus);
//        request.getRequestDispatcher("customer/create.jsp").forward(request, response);


        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null) {
            loadList(request, response);
        }
        switch(action){
            case "create":
                showCreateForm(request,response);
                break;
            default:
                loadList(request,response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            loadList(request,response);
        }
        switch(action){
            case "create":
                showCreateForm(request,response);
                break;
            default:
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("customer/create.jsp");
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCus", this.customerService.findAll());
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);
    }
}
