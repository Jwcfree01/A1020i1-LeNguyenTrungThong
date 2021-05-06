package sevlet;

import bean.customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet", urlPatterns ="/")
public class customerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List <customer> customerList = new ArrayList<>();

        customerList.add(new customer("thong", "12-12-2012", "quang nam", "/image/avatar.jpg"));
        customerList.add(new customer("thong1", "13-12-2012", "quang nam1", "/image/avatar.jpg"));
        customerList.add(new customer("thong2", "14-12-2012", "quang nam2", "/image/avatar.jpg"));
        customerList.add(new customer("thong3", "15-12-2012", "quang nam3", "/image/avatar.jpg"));

        request.setAttribute("list1", customerList);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}
