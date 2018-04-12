package servlet;

import controller.DatabaseConnectionController;
import mapper.ObjectToDownloadMapper;
import model.ObjectToDownload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectToDownloadMapper mapper = new ObjectToDownloadMapper(new DatabaseConnectionController().establishConnection());
        Long id = Long.decode(req.getParameter("fileId"));
        ObjectToDownload o  = mapper.find(id,true);


        String filename = o.getFileName();
        String contentType = this.getServletContext().getMimeType(filename);
        System.out.println(contentType);
        resp.setHeader("Content-Type", contentType);

        byte[] bytes = new byte[1024];
        int bytesRead;

        while ((bytesRead = o.getFile().read(bytes)) != -1) {
            resp.getOutputStream().write(bytes, 0, bytesRead);
        }
        o.getFile().close();


    }
}
