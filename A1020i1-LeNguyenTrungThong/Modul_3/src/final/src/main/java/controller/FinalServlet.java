package controller;

import model.bean.MatBang;
import model.service.MatBangService;
import model.service.MatBangServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FinalServlet", urlPatterns = "")
public class FinalServlet extends HttpServlet {
    MatBangService matBangService = new MatBangServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                createMatBang(request, response);
                break;
            default:
                showMatBang(request, response);
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
            case "":
                showMatBang(request, response);
                break;
            case "delete":
                deleteMatBang(request,response);
                break;
            case "create":
                showFormCreateMatBang(request,response);
                break;
            case "search":
                searchFloor(request,response);
                break;
            default:
                showMatBang(request, response);
                break;
        }
    }

    private void searchPrice(HttpServletRequest request, HttpServletResponse response) {
        double price = Double.parseDouble(request.getParameter("name"));
        System.out.println(price);
        List<MatBang> matBangList = this.matBangService.searchPrice(price);
        request.setAttribute("showMatBang", matBangList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void searchFloor(HttpServletRequest request, HttpServletResponse response) {
        int floor = Integer.parseInt(request.getParameter("name"));
        System.out.println(floor);
        List<MatBang> matBangList = this.matBangService.searchSoTang(floor);
        request.setAttribute("showMatBang", matBangList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void createMatBang(HttpServletRequest request, HttpServletResponse response) {
        String maMatBang = request.getParameter("maMatBang");
        String status = request.getParameter("status");
        int area = Integer.parseInt(request.getParameter("area"));
        int floor = Integer.parseInt(request.getParameter("floor"));
        String type = request.getParameter("type");
        Double price = Double.parseDouble(request.getParameter("price"));
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        MatBang matBang = new MatBang(maMatBang, status, area, floor, type, price, startDate, endDate);
        this.matBangService.createMatBang(matBang);
        showMatBang(request,response);
    }

    private void showFormCreateMatBang(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher dd = request.getRequestDispatcher("create.jsp");
            dd.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void deleteMatBang(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        this.matBangService.deleteMatBang(id);
        showMatBang(request,response);
    }

    private void showMatBang(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showMatBang", this.matBangService.findAll());
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
