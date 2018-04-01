package servlets;

import controllers.DatabaseController;
import model.UserToReg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.getRequestDispatcher("/views/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();


        UserToReg user = new UserToReg();
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setConfinrmPassword(req.getParameter("confirmPassword"));
        user.setEmail(req.getParameter("email"));

        if(!user.getPassword().equals(user.getConfinrmPassword())){
            session.setAttribute("showWarning", true);
            req.getRequestDispatcher("/views/register.jsp").forward(req,resp);
        }
        new DatabaseController().addToDataBase(user);

        session.setAttribute("showRegistrationInfo", true);
        req.getRequestDispatcher("/views/login.jsp").forward(req,resp);

    }
}
