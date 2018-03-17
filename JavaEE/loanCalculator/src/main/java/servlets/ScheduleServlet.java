package servlets;

import Controller.CalculationController;
import Pojo.Calculation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/schedule")
public class ScheduleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Calculation calculation = new Calculation();
        calculation.setLoanValue(req.getParameter("loanValue"));
        calculation.setNumberOfInstallments(req.getParameter("numberOfInstallments"));
        calculation.setInterest(req.getParameter("interest"));
        calculation.setFixedFees(req.getParameter("fixedFees"));
        calculation.setInstallmentsType(req.getParameter("installmentsType"));

        session.setAttribute("schedule",new CalculationController().pobierzHarmonogram(calculation));
        req.setAttribute("schedule",new CalculationController().pobierzHarmonogram(calculation));
        req.getRequestDispatcher("views/schedule.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/");
    }


}
