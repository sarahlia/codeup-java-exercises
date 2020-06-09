package homepractice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "homepractice.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //when a user successfully logs in, set a key named "user"
        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("user", username);
            //successfully logged in user goes to profile page
            response.sendRedirect("/profile");
        } else {
            //redirect unauthorized users to the login page (vs. profile page)
            response.sendRedirect("/login");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //if a person is logged in, they go to the profile page
        if( request.getSession().getAttribute("user") != null ) {
            response.sendRedirect("/profile");
        }

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

}
