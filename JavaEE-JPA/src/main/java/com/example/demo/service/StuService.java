package com.example.demo.service;


import com.example.demo.entity.student;
import com.example.demo.mapper.StuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {
    final
    StuMapper stuMapper;

    public StuService(StuMapper stuMapper) {
        this.stuMapper = stuMapper;
    }

    public List<student> findAll(){
        return stuMapper.findAll();
    }
    public void addStudent(student stu){
        stuMapper.save(stu);
    }
}
