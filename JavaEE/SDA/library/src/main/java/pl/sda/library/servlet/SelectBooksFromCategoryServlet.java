package pl.sda.library.servlet;

import pl.sda.library.dao.BookDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/selectCategory")
public class SelectBooksFromCategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String categoryId = req.getParameter("categoryToSelect");

        req.getSession().removeAttribute("books");

        if (categoryId.equals("wszystkie")) {
            req.setAttribute("books", new BookDAO().findAll());
        } else {
            req.setAttribute("books", new BookDAO().findBooksByCategory(categoryId));
        }
        req.getRequestDispatcher("/book.jsp").forward(req, resp);

    }
}
