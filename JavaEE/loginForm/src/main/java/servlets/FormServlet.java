package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getAttribute("zalogowany") == null){
            req.setAttribute("zalogowany",false);
            req.getRequestDispatcher("/login").forward(req,resp);
        }else {
            req.getRequestDispatcher("/login").forward(req,resp);
        }

    }
}
