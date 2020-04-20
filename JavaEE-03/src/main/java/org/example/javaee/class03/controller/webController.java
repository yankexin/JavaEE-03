package org.example.javaee.class03.controller;

import org.example.javaee.class03.jdbc.shjdbc;
import org.example.javaee.class03.model.homework;
import org.example.javaee.class03.model.stuhom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/")
@Controller
public class webController {
    @RequestMapping(value = "/allHomework",method = RequestMethod.GET)
    public ModelAndView StartPage() {
        ModelMap map=new ModelMap();
        List<homework> list = shjdbc.allHomework();
        map.put("list", list);
        return new ModelAndView("reciveControllerData",map);
    }
    @RequestMapping(value = "/allStuHom",method = RequestMethod.GET)
    public ModelAndView allStuHom(){
        ModelMap map=new ModelMap();
        List<stuhom> list = shjdbc.allSH();
        map.put("list", list);
        return new ModelAndView("reciveControllerData",map);
    }
    @RequestMapping(value = "/student")
    public ModelAndView student() {
        return new ModelAndView();
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public ModelAndView addstudent(HttpServletRequest req){
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        shjdbc.addStudent(id,name);
        return new ModelAndView();
    }
    @RequestMapping(value = "/addHomework",method = RequestMethod.POST)
    public ModelAndView addStuHom(HttpServletRequest req)
    {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        shjdbc.addHomework(title,content);
        return new ModelAndView();
    }
    @RequestMapping(value = "/submit")
    public ModelAndView submit(HttpServletRequest req){
        String id = req.getParameter("id");
        //根据编号读取作业内容
        homework homework = shjdbc.getHomework(id);
        req.setAttribute("homework",homework);
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
        return new ModelAndView();
    }

}