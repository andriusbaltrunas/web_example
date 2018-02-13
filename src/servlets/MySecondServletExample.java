package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 2/13/2018.
 */
@WebServlet(value = "/secondExample")
public class MySecondServletExample extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = "Vygis";
        String surname ="Spygis";
        int age = 124;

        req.setAttribute("vardas", name);
        req.setAttribute("pavarde", surname);
        req.setAttribute("amzius",age);


        req.getRequestDispatcher("result.jsp").forward(req, resp);

    }
}
