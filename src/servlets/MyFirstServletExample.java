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
@WebServlet(value = "/testRequest")
public class MyFirstServletExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // resp.getWriter().println("CIA ATEJO IS SERVERIO PUSES"); NENAUDOTI AS RIMTAI!!!!
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
    }
}
