package controllers;

import dao.UserDAO;
import model.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(value = {"/", "/home"})
public class homeController extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    // home -

//    @Override
//    protected void doGet(
//            HttpServletRequest req,
//            HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("It's working");// Вивід на консоль при роботі сервера
////        resp.setHeader("contentType","text/html");//Тип контенту який буде використовуватися, метаінформація !
////        PrintWriter writer = resp.getWriter();//Створюємо вихідний потік
////        writer.println("hello !!");// Записати на екран як HTML, через метод прінтлн
////        writer.close();// Закрити потік*/
//
//        String name = req.getParameter("name");// це "ключ" параметру "name"
//        String surname = req.getParameter("surname");// це "ключ" параметру "surname"
//
//        req.setAttribute("name", name);// через метод setAttribute оголошуємо параметр і його ключ:  "ключ", параметр
//        req.setAttribute("surname", surname);// через метод setAttribute оголошуємо параметр і його ключ:  "ключ", параметр
//
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);// посилання на документ /index.jsp
//
//
//    }


    //    // home -POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST");
        String name = req.getParameter("name");// це "ключ" параметру "name"
        String surname = req.getParameter("surname");// це "ключ" параметру "surname"

        req.setAttribute("name", name);// через метод setAttribute оголошуємо параметр і його ключ:  "ключ", параметр
        req.setAttribute("surname", surname);// через метод setAttribute оголошуємо параметр і його ключ:  "ключ", параметр

        userDAO.save(new user(name, surname));// ЗБереження у БД

        List<user> userList = userDAO.findAll();
        req.setAttribute("userList", userList);


        req.getRequestDispatcher("/index.jsp")
                .forward(req, resp);// посилання на документ /index.jsp




    }
}
