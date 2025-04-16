import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials for demo purpose
        String validUser = "admin";
        String validPass = "12345";

        if (username.equals(validUser) && password.equals(validPass)) {
            out.println("<html><body style='text-align:center; font-family:sans-serif;'>");
            out.println("<h2 style='color:green;'>Welcome, " + username + "!</h2>");
            out.println("<p>You have successfully logged in.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body style='text-align:center; font-family:sans-serif;'>");
            out.println("<h2 style='color:red;'>Login Failed</h2>");
            out.println("<p>Invalid username or password. Please try again.</p>");
            out.println("</body></html>");
        }

        out.close();
    }
}
