package com.example.demo.controller;


import com.example.demo.entity.homework;
import com.example.demo.entity.student;
import com.example.demo.entity.stuhom;
import com.example.demo.service.HomService;
import com.example.demo.service.SHService;
import com.example.demo.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/")
@Controller
public class webController {
    final
    StuService stuService;
    final
    HomService homService;
    final
    SHService shService;


    public webController(StuService stuService, HomService homService, SHService shService){
        this.stuService = stuService;
        this.homService = homService;
        this.shService = shService;
    }

    @RequestMapping(value = "/allHomework",method = RequestMethod.GET)
    public ModelAndView StartPage() {
        ModelMap map=new ModelMap();
        List<homework> list = homService.findAll();
        map.put("list", list);
        return new ModelAndView("reciveControllerData",map);
    }
    @RequestMapping(value = "/allStuHom",method = RequestMethod.GET)
    public ModelAndView allStuHom(){
        ModelMap map=new ModelMap();
        List<stuhom> list = shService.findAll();
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
        student stu = new student();
        stu.setId(id);
        stu.setName(name);
        stuService.addStudent(stu);
        return new ModelAndView();
    }
    @RequestMapping(value = "/addHomework",method = RequestMethod.POST)
    public ModelAndView addStuHom(HttpServletRequest req)
    {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        homework hom = new homework();
        hom.setTitle(title);
        hom.setContent(content);
        homService.submit(hom);
        return new ModelAndView();
    }
    @RequestMapping(value = "/submit")
    public ModelAndView submit(HttpServletRequest req){
        String id = req.getParameter("id");
        //根据编号读取作业内容
        homework homework = new homework();
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
        shService.submit(sh);
        return new ModelAndView();
    }

}