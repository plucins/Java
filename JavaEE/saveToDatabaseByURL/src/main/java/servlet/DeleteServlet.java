package servlet;

import controller.DatabaseConnectionController;
import mapper.ObjectToDownloadMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectToDownloadMapper mapper = new ObjectToDownloadMapper(new DatabaseConnectionController().establishConnection());
        Long id = Long.decode(req.getParameter("fileId"));
        mapper.remove(id);
        resp.sendRedirect("/");
    }
}
