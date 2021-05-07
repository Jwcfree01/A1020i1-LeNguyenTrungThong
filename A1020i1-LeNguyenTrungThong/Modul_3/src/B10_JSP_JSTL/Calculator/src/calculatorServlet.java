import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", urlPatterns = "/abc")
public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("input1"));
        double b = Double.parseDouble(request.getParameter("input2"));
        char n = request.getParameter("n").charAt(0);

        Double result = calculator.Calculator(a,b,n);

        request.setAttribute("result",result);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }
