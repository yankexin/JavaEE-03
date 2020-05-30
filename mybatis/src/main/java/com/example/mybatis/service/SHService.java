package com.example.mybatis.service;

import com.example.mybatis.dao.HomDao;
import com.example.mybatis.dao.SHDao;
import com.example.mybatis.entity.homework;
import com.example.mybatis.entity.stuhom;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SHService {
    private SHDao shDao;
    public List<stuhom> findAll(){
        return shDao.findAll();
    }
    public void addStuHom(stuhom sh){
        shDao.addStuHom(sh);
    }
}
