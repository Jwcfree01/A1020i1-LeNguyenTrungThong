import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/abcxyz")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("name");
        String password = request.getParameter("pass");

        String abc = "hello";
        String bcd = "err";

        if (username.equals("admin") && password.equals("admin")){
            request.setAttribute("to1", abc);
            request.getRequestDispatcher("resultlogin.jsp").forward(request, response);
        }else {
            request.setAttribute("to1", bcd);
            request.getRequestDispatcher("resultlogin.jsp").forward(request, response);
        }
    }
}
