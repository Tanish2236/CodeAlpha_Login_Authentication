import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implementation for logout
        // ...
    	HttpSession session = request.getSession(false); // Get the session, but don't create if it doesn't exist

        if (session != null) {
            session.invalidate(); // Invalidate the session
        }

        response.sendRedirect("login.jsp"); // Redirect to the login page
    }

    
}
