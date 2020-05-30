package com.example.mybatis.dao;

import com.example.mybatis.entity.homework;
import java.util.List;

public interface HomDao {
    homework getHomework(String id);
    List<homework> findAll();
    void addHomework(String title, String content);
}
