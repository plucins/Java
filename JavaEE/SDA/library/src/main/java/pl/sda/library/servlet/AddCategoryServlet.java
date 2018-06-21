package pl.sda.library.servlet;

import pl.sda.library.dao.CategoryDAO;
import pl.sda.library.model.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addCategory")
public class AddCategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category = new Category();
        category.setName(req.getParameter("name"));
        new CategoryDAO().add(category);
        resp.sendRedirect("/category.jsp");
    }
}
