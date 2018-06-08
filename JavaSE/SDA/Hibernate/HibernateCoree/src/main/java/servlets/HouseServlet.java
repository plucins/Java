package servlets;

import dao.HouseDAO;
import model.House;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/house")
public class HouseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<House> houses = new HouseDAO().findAll();
        req.setAttribute("house",houses);

        req.getRequestDispatcher("/");
    }
}
