package servlet;

import controller.DatabaseConnectionController;
import controller.ThreadController;
import mapper.ObjectToDownloadMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class PageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectToDownloadMapper mapper = new ObjectToDownloadMapper(new DatabaseConnectionController().establishConnection());
        new ThreadController().run();

        req.getSession().setAttribute("allFiles",mapper.select());
        req.getRequestDispatcher("/views/index.jsp").forward(req,resp);
    }

}
