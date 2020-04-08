package org.example.javaee.class03.servlet;

import org.example.javaee.class03.jdbc.shjdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class addHomeworkServlet  extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String content = req.getParameter("content");
        shjdbc.addHomework(title,content);
        req.getRequestDispatcher("jsp/teacher.jsp").forward(req, resp);
    }


}
