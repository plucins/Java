package controllers;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

//@WebServlet("/")
@Path("/")
public class HelloServlet extends HttpServlet {

    @GET
    public Response getMeyhod() {
        return Response.ok("jest ok").build();
    }


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("jestem tu");
//    }
}
