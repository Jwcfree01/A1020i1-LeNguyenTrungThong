import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "tinhChietKhauServlet", urlPatterns = "/abcde")
public class tinhChietKhauServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("mota");
        int b = Integer.parseInt(request.getParameter("gia"));
        int c = Integer.parseInt(request.getParameter("phantram"));

        int d = (int) (b*0.01*c);
        int e = b-d;

        request.setAttribute("num1", a);
        request.setAttribute("num2", b);
        request.setAttribute("num3", c);
        request.setAttribute("num4", d);
        request.setAttribute("num5", e);
        request.getRequestDispatcher("display-discount.jsp").forward(request, response);
    }
}
