package com.example.mybatis.dao;

import com.example.mybatis.entity.homework;
import com.example.mybatis.entity.stuhom;

import java.util.List;

public interface SHDao {
    List<stuhom> findAll();
    void addStuHom(stuhom sh);
}
