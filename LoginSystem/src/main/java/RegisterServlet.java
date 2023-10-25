import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (!UserDatabase.users.containsKey(username)) {
            UserDatabase.users.put(username, password);
            request.setAttribute("registrationSuccess", true);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
        	request.setAttribute("userExists", true);
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
