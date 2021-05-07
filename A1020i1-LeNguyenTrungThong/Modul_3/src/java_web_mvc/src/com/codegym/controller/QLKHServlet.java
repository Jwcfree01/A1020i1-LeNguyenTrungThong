package com.codegym.controller;

import com.codegym.model.bean.customer;
import com.codegym.service.customerService;
import com.codegym.service.customerServiceImpl;

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
        request.getRequestDispatcher("customer/create.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCus", this.customerService.findAll());
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);

        String actionUser = request.getParameter("actionUser");

        if (actionUser == null) {
            this.loadList(request, response);
        } else if ("create".equals(actionUser)) {
            response.sendRedirect("customer/create.jsp");
        }
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCus", this.customerService.findAll());
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);
    }
}
