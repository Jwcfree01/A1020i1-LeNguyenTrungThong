package controller;

import model.bean.Product;
import model.service.ProductService;
import model.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QLSPServlet", urlPatterns = "")
public class QLSPServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                addProduct(request,response);
                break;
            case "edit":
                editProduct(response, request);
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
                response.sendRedirect("create.jsp");
                break;
            case "delete":
                deletePro(request,response);
                break;
            case "edit":
                showFormEdit(request, response);
            case "back":
                loadList(request,response);
            case "view":
                showView(request,response);
            default:
                loadList(request,response);
                break;
        }
    }

    private void showView(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product proEdit = productService.findById(id);
        request.setAttribute("product", proEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deletePro(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.deleteProduct(id);
        loadList(request,response);
    }

    private void loadList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("showPro", this.productService.showProduct());
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        this.productService.newProduct(new Product(id, name, price));
        loadList(request,response);
    }
    
    private void editProduct(HttpServletResponse response, HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        Product proEdit = new Product(id, name, price);
        this.productService.updateProduct(proEdit);
        loadList(request,response);
    }

    private String getPrice() {
        return "price";
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product proEdit = productService.findById(id);
        request.setAttribute("product", proEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
