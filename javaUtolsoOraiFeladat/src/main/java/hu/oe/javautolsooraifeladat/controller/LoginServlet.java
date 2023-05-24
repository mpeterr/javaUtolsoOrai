package hu.oe.javautolsooraifeladat.controller;

import hu.oe.javautolsooraifeladat.model.User;
import hu.oe.javautolsooraifeladat.model.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserRepository users = (UserRepository) request.getServletContext().getAttribute("users");

        //logika az ellenőrzésre
        User user = users.findUser(username);
        if (user != null){//user létezik e
            //létezik
            if (user.isPasswordCorrect(password)){//megfelelő-e a password
                //igen
                //usert hozzáadjuk a session-höz
                request.getSession().setAttribute("user", user);
                //továbbküldjük az információkat a MainPage.jsp-re
                request.getRequestDispatcher("mainpage.jsp").forward(request, response);
            }
            else//nem
            {
                //elküldjük az incorrect password html oldalra
                request.getRequestDispatcher("incorrectpassword.html").forward(request, response);
            }
        }
        else//nem létezik
        {
            //elküldjük a registration jsp oldalra
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        }
    }
}
