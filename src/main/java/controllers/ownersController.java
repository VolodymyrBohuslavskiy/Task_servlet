package controllers;

import dao.OwnerDAO;
import model.Owner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/owners")

public class ownersController extends HttpServlet {
     OwnerDAO ownerDAO = new OwnerDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("owners work");

        String firstName = req.getParameter("firstName");
        req.setAttribute("firstName", firstName);
        String secondName = req.getParameter("secondName");
        req.setAttribute("secondName", secondName);

        if (firstName != null || secondName != null)
            ownerDAO.save(new Owner(firstName, secondName));

        req.getRequestDispatcher("/owners.jsp").forward(req, resp);
    }
}
