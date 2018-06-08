package servlets;

import dao.MieszkaniecDAO;
import model.House;
import model.Mieszkaniec;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dodajeMieszkanca")
public class MieszkaniecServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Mieszkaniec mieszkaniec = new Mieszkaniec();
        mieszkaniec.setName(req.getParameter("name"));
        mieszkaniec.setLastName(req.getParameter("lastName"));
        System.out.println(req.getParameter("house"));
        String[] house = req.getParameter("house").split(",",2);
        mieszkaniec.setHouse(new House(house[0],Integer.parseInt(house[1])));

        new MieszkaniecDAO().add(mieszkaniec);
    }
}
