package com.main;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from form
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        // Create and populate bean
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        HttpSession session = request.getSession();
        session.setAttribute("studentBean", student);

        response.sendRedirect("display.jsp");
    }
}
