package servlets;

import controllers.DatabaseController;
import model.UserToReg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("showWarning", false);
        req.setAttribute("showRegistrationInfo", false);
        req.getRequestDispatcher("/views/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserToReg user = new UserToReg();
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setConfinrmPassword(req.getParameter("confirmPassword"));
        user.setEmail(req.getParameter("email"));

        if(!user.getPassword().equals(user.getConfinrmPassword())){
            req.setAttribute("showWarning", true);
            req.getRequestDispatcher("/views/register.jsp").forward(req,resp);
        }
        new DatabaseController().addToDataBase(user);

        req.setAttribute("showRegistrationInfo", true);
        req.getRequestDispatcher("/views/login.jsp").forward(req,resp);

    }
}
