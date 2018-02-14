package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 2/13/2018.
 */
@WebServlet(value = "/getStudents")
public class MyTestConnectionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");


            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/kcs", "root", "MySQL");
            if(connection != null){
                System.out.println("PRISIJUNGEME");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS");
                while (resultSet.next()){

                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
