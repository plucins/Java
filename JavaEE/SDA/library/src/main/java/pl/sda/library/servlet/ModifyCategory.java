package pl.sda.library.servlet;

import pl.sda.library.dao.CategoryDAO;
import pl.sda.library.model.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifyCategory")
public class ModifyCategory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

            CategoryDAO dao = new CategoryDAO();
            dao.remove(dao.findByID(Long.parseLong(id)));

        resp.sendRedirect("/category.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        CategoryDAO dao = new CategoryDAO();
        Category c = dao.findByID(Long.parseLong(id));
        c.setName(req.getParameter("name"));
        dao.update(c);

        resp.sendRedirect("/category.jsp");
    }
}
