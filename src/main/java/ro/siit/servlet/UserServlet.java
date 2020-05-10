package ro.siit.servlet;


import ro.siit.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns={"/myAge"})

public class UserServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        this.userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int age = this.userService.getAge();
        req.setAttribute("myAgeToBeDisplayed", age);
        req.getRequestDispatcher("/jsps/myAge.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int age = this.userService.getAge();
        req.setAttribute("myAgeToBeDisplayed", age);
        resp.getWriter().println("age: " + userService.getAge());
        req.getRequestDispatcher("/jsps/myAge.jsp").forward(req, resp);
    }
}
