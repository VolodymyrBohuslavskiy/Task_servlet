package controllers;

import dao.CarDAO;
import model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(value = "/cars")

public class carsController extends HttpServlet {
    private CarDAO carDAO = new CarDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("cars work");


        String brand = req.getParameter("brand");
        req.setAttribute("brand", brand);
        String model = req.getParameter("model");
        req.setAttribute("model", model);


        Car newcar = new Car(brand, model);

        if (brand != null && model != null)
            carDAO.save(newcar);


        req.getRequestDispatcher("/cars.jsp").forward(req, resp);
    }
}

