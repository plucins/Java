package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if(session.getAttribute("showRegistrationInfo") == null){
            session.setAttribute("showRegistrationInfo", false);
        }
        if(session.getAttribute("showAuthError") == null){
            session.setAttribute("showAuthError", false);
        }

        if(session.getAttribute("zalogowany") == null){
            session.setAttribute("zalogowany",false);
            req.getRequestDispatcher("/login").forward(req,resp);
        }else {
            req.getRequestDispatcher("/index").forward(req,resp);
        }

    }
}
