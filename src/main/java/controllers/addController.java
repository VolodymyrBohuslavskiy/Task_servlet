package controllers;

import dao.CarDAO;
import dao.OwnerDAO;
import model.Car;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = {"/", "/add"})
public class addController extends HttpServlet {
    private CarDAO carDAO = new CarDAO();
    private OwnerDAO ownerDAO = new OwnerDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add GET work");

        List<Car> carlist = carDAO.findAllCars();
        req.setAttribute("carlist", carlist);
        List<Car> owners = ownerDAO.findAllOwners();
        req.setAttribute("owners", owners);


        final String car = req.getParameter("car");
        System.out.println(car);
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

}
