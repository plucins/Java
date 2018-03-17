package servlets;

import DataBase.DBController;
import Pojo.Policy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Policy policy = new Policy();
        policy.setBrand(request.getParameter("brand"));
        policy.setPolicyNumber(request.getParameter("policyNumber"));
        policy.setCallerPhoneNumber(request.getParameter("callerPhoneNumber"));
        policy.setPolicyValue(request.getParameter("policyValue"));
        policy.setSourceIncome(request.getParameter("sourceIncome"));
        policy.setExtraInfo(request.getParameter("extraInfo"));
        policy.setAgencyClient(request.getParameter("agencyClient"));
        policy.setAgentName(getCookie(request,"agentName"));
        policy.setAgentLastName(getCookie(request,"agentLastName"));
        policy.setAgentDomainLogin(getCookie(request,"agentDomainLogin"));

        response.getWriter().println(policy);
        new DBController().insertRecord(policy);

        response.sendRedirect("/");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/");
    }


    private String getCookie(HttpServletRequest request, String cookieName){
        Cookie[] cookies = request.getCookies();
        String cookieValue = "";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                        cookieValue = cookie.getValue();
                }
            }
        }
        return cookieValue;
    }

}
