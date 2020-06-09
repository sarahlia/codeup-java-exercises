package homepractice;

import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //if a user who is logged in visits /logout, the session is invalidated..
        request.getSession().invalidate();
        //then the user is redirected to the login page
        response.sendRedirect("login");
    }
}
