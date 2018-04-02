package servlets;

import controllers.DatabaseController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rights")
public class RightsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DatabaseController controller = new DatabaseController();
        req.getSession().setAttribute("allUsers",controller.getAllUsers());
        req.getRequestDispatcher("/views/rights.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        new DatabaseController().updatePrivileges(req.getParameter("userToChange"),req.getParameter("newRights"));
        doGet(req,resp);
    }
}
