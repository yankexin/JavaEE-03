package com.example.mybatis.service;

import com.example.mybatis.dao.HomDao;
import com.example.mybatis.dao.StuDao;
import com.example.mybatis.entity.homework;
import com.example.mybatis.entity.student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomService {
    private HomDao homDao;
    public List<homework> findAll(){
        return homDao.findAll();
    }
    public void addHomework(String title, String content){
        homDao.addHomework(title, content);
    }
    public homework getHomework(String id){
        return homDao.getHomework(id);
    }
}
