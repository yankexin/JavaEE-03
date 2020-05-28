package com.example.mybatis.service;

import com.example.mybatis.dao.StuDao;
import com.example.mybatis.entity.student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {
    private StuDao stuDao;

    public List<student> findAll(){
        return stuDao.findAll();
    }
}
