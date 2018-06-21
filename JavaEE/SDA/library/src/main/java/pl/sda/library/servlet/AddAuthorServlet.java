package pl.sda.library.servlet;

import pl.sda.library.dao.AuthorDAO;
import pl.sda.library.model.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addAuthor")
public class AddAuthorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Author author = new Author();
        author.setName(req.getParameter("name"));
        author.setSurname(req.getParameter("surname"));

        new AuthorDAO().add(author);
        resp.sendRedirect("/author.jsp");
    }
}
