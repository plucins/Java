package servlets;

import Pojo.Agent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Agent agent = new Agent();
        int counter = 0;

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("agentName")) {
                    agent.setName(c.getValue());
                    counter++;
                }
                if (c.getName().equals("agentLastName")) {
                    agent.setLastName(c.getValue());
                    counter++;
                }
                if (c.getName().equals("agentDomainLogin")) {
                    agent.setDomainLogin(c.getValue());
                    counter++;
                }
            }
        }
        if(counter != 3 ){
            req.getRequestDispatcher("/views/form.jsp").forward(req,resp);
        }

        req.setAttribute("agentObj",agent);
        req.getRequestDispatcher("/views/index.jsp").forward(req,resp);
    }
}
