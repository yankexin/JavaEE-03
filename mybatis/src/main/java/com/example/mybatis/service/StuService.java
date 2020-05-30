package com.example.mybatis.service;

import com.example.mybatis.dao.StuDao;
import com.example.mybatis.entity.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class StuService {

    private StuDao stuDao;
    public List<student> findAll(){
        return stuDao.findAll();
    }
    public void addStudent(String id,String name){
        stuDao.addStudent(id,name);
    }
}
