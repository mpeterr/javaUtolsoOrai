package hu.oe.javautolsooraifeladat.controller;

import hu.oe.javautolsooraifeladat.model.User;
import hu.oe.javautolsooraifeladat.model.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");

        User newuser = new User(username, password, fullname, address);

        UserRepository users = (UserRepository) request.getServletContext().getAttribute("users");

        users.addUser(newuser);

        request.getSession().setAttribute("user", newuser);

        request.getRequestDispatcher("mainpage.jsp").forward(request, response);
    }
}
