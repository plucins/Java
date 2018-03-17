package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addCookie")
public class AddCookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Cookie agentName = new Cookie("agentName",req.getParameter("name"));
        Cookie agentLastName = new Cookie("agentLastName",req.getParameter("lastName"));
        Cookie agentDomainLogin = new Cookie("agentDomainLogin",req.getParameter("domainLogin"));
        agentName.setMaxAge(60 * 60 * 24 * 365 * 10);
        resp.addCookie(agentName);
        agentLastName.setMaxAge(60 * 60 * 24 * 365 * 10);
        resp.addCookie(agentLastName);
        agentDomainLogin.setMaxAge(60 * 60 * 24 * 365 * 10);
        resp.addCookie(agentDomainLogin);
        resp.sendRedirect( "/");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect( "/");
    }
}
