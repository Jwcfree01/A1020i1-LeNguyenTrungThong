import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", urlPatterns = "/abc")
public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("input1"));
        int b = Integer.parseInt(request.getParameter("input1"));
        char n = request.getParameter("n").charAt(0);
        float result = calculator.Calculator(a,b,n);

            request.setAttribute("a", a);
            request.setAttribute("b", b);
            request.setAttribute("n", n);
        request.setAttribute("results", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }
