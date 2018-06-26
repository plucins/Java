package pl.sda.library.servlet;

import pl.sda.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectAuthor")
public class SelectBooksByAuthorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actorId = req.getParameter("actorToSelect");

        req.getSession().removeAttribute("books");

        if (actorId.equals("wszyscy")) {
            req.setAttribute("books", new BookDAO().findAll());
        } else {
            req.setAttribute("books", new BookDAO().findBooksByActor(actorId));
        }
        req.getRequestDispatcher("/book.jsp").forward(req, resp);
    }
}
