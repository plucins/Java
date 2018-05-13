package servlets;

import DataBase.DBController;
import Pojo.Policy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/generateCsv")
public class GenerateCsv extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String dateFrom = req.getParameter("dateFrom");
        String dateTo = req.getParameter("dateTo");
        String agentLogin = req.getParameter("agentLogin");

        System.out.println(agentLogin);
        List<Policy> policies;

        if(agentLogin.equals("wszyscy")){
            policies = new DBController().getPoliciesFromPointedDate(dateFrom,dateTo);
        }else {
            policies = new DBController().getPoliciesFromPointedDate(dateFrom,dateTo,agentLogin);
        }

        resp.setContentType("application/csv");
        resp.setHeader("Content-Disposition","attachment; filename ='raport.csv'");
        PrintWriter w = resp.getWriter();
        w.println(generateCsvFile(policies));
        w.flush();
        w.close();

        resp.sendRedirect("/");
    }

    private String generateCsvFile(List<Policy> policies) {
        String output = "Marka, Numer Polisy, Numer Dzwoniacego, Skladka, Zrodlo, Dodatkowe Info, Imie Konsultanta, Nazwisko Konsultant, Login Konsultanta, Data dodania \n";

        for (Policy p :policies) {
        output += p.getBrand() + ", " + p.getPolicyNumber() + ", " + p.getCallerPhoneNumber() + ", " + p.getPolicyValue()  +  ", " + p.getSourceIncome() + ", " + p.getExtraInfo() + ", " + p.getAgentName() +
                ", " + p.getAgentLastName() + ", " + p.getAgentDomainLogin() + ", " + p.getPolicyCalculationDate() +"\n";
    }

        return output;
    }
}
