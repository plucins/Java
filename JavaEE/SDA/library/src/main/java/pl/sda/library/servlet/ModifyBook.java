package pl.sda.library.servlet;

import pl.sda.library.dao.AuthorDAO;
import pl.sda.library.dao.BookDAO;
import pl.sda.library.dao.CategoryDAO;
import pl.sda.library.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifyBook")
public class ModifyBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        BookDAO dao = new BookDAO();
        dao.remove(dao.findByID(Long.parseLong(id)));

        resp.sendRedirect("/book.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        BookDAO dao = new BookDAO();
        Book b = dao.findByID(Long.parseLong(id));
        b.setTitle(req.getParameter("title"));
        b.setCategory(new CategoryDAO().findByID(Long.parseLong(req.getParameter("category"))));
        b.setAuthors(new AuthorDAO().findByID(Long.parseLong(req.getParameter("author"))));
        b.setYear(Integer.parseInt(req.getParameter("year")));
        dao.update(b);

        resp.sendRedirect("/book.jsp");
    }
}
