package org.example.javaee.class03.servlet;

import org.example.javaee.class03.jdbc.shjdbc;
import org.example.javaee.class03.model.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class allHomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<homework> list = shjdbc.allHomework();
        req.setAttribute("list", list);
        req.getRequestDispatcher("jsp/allHomework.jsp").forward(req, resp);
    }


}
