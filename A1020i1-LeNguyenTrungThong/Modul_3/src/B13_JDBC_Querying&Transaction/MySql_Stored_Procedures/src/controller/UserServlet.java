package controller;

import model.bean.User;
import model.service.UserService;
import model.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "")
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                addUser(request, response);
                break;
            case "edit":
                editUser(request, response);
                break;
            default:
                loadList(request, response);
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
                response.sendRedirect("create.jsp");
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            default:
                loadList(request,response);
                break;
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.userService.deleteUser(id);
        loadList(request,response);
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showUser", this.userService.findAllUsers());
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        this.userService.addUser(user);
        loadList(request,response);
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        this.userService.updateUser(id, user);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        loadList(request,response);
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User userEdit = userService.findId(id);
        request.setAttribute("user", userEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");

        request.setAttribute("search", this.userService.search(search));
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
            loadList(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
