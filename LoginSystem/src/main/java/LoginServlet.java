import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (UserDatabase.users.containsKey(username) && UserDatabase.users.get(username).equals(password)) {
        	HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Login successful
            response.sendRedirect("secured.jsp");
        } else {
        	request.setAttribute("invalidCredentials", true);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
