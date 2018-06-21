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

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle(req.getParameter("title"));
        book.setCategory(new CategoryDAO().findByID(Long.parseLong(req.getParameter("category"))));
        book.setAuthors(new AuthorDAO().findByID(Long.parseLong(req.getParameter("author"))));
        book.setYear(Integer.parseInt(req.getParameter("year")));

        new BookDAO().add(book);

        resp.sendRedirect("/book.jsp");
    }
}
