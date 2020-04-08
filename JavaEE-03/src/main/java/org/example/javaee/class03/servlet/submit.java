package org.example.javaee.class03.servlet;

import org.example.javaee.class03.model.stuhom;
import org.example.javaee.class03.jdbc.shjdbc;
import org.example.javaee.class03.model.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class submit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        //根据编号读取作业内容
        homework homework = shjdbc.getHomework(id);
        req.setAttribute("homework",homework);
        req.getRequestDispatcher("jsp/submit.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        stuhom sh = new stuhom();
        String sid = req.getParameter("sid");
        sh.setSId(Long.parseLong(sid));
        String scontent = req.getParameter("scontent");
        sh.setSContent(scontent);
        String hid = req.getParameter("hid");
        sh.setHId(Long.parseLong(hid));
        String hcontent = req.getParameter("hcontent");
        sh.setHContent(hcontent);
        String title = req.getParameter("title");
        sh.setTitle(title);
        shjdbc.addStuHom(sh);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}

