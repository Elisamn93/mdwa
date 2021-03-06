package s15;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s15/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        request.setAttribute("user", user);

        if (user == null || password == null || user.isBlank() || password.isBlank()) {
            request.getRequestDispatcher("/s15/unknown.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/s15/logged.jsp").forward(request, response);
        }
    }
}
