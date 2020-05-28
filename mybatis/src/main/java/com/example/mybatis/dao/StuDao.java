package com.example.mybatis.dao;

import com.example.mybatis.entity.student;

import java.util.List;

public interface StuDao {
    List<student> findAll();
    void addStudent(String id,String name);
}
