package pl.sda.library.servlet;

import pl.sda.library.dao.AuthorDAO;
import pl.sda.library.model.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifyAuthor")
public class ModifyAuthor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

            AuthorDAO dao = new AuthorDAO();
            dao.remove(dao.findByID(Long.parseLong(id)));

        resp.sendRedirect("/author.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        AuthorDAO dao = new AuthorDAO();
        Author a = dao.findByID(Long.parseLong(id));
        a.setName(req.getParameter("name"));
        a.setSurname(req.getParameter("surname"));
        dao.update(a);

        resp.sendRedirect("/author.jsp");
    }
}
