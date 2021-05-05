import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "translateServlet", urlPatterns = "/abcd")
public class translateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> tudien = new HashMap<>();
        tudien.put("hi", "xin chào");
        tudien.put("student", "hoc sinh");

        String a = request.getParameter("search");

        Set<String> key = tudien.keySet();
        for (String i : key){
            String n;
            if (a.equals(i)){
                n = a + tudien.get(i);
            }else {
                n = a + " khong ton tai";
            }
            request.setAttribute("tu1", n);
            request.getRequestDispatcher("resultTranslate.jsp").forward(request, response);
        }
    }
}
