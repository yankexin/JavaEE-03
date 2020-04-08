package org.example.javaee.class03.servlet;

import org.example.javaee.class03.jdbc.shjdbc;
import org.example.javaee.class03.model.stuhom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class allStuHomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<stuhom> list = shjdbc.allSH();
        req.setAttribute("list", list);
        req.getRequestDispatcher("jsp/allStuHom.jsp").forward(req, resp);
    }
}
