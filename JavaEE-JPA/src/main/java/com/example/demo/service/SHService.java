package com.example.demo.service;

import com.example.demo.entity.stuhom;
import com.example.demo.mapper.StuHomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SHService {
    final
    StuHomMapper stuHomMapper;

    public SHService(StuHomMapper stuHomMapper) {
        this.stuHomMapper = stuHomMapper;
    }

    public List<stuhom> findAll(){
        return stuHomMapper.findAll();
    }
    public void submit(stuhom sh){
        stuHomMapper.save(sh);
    }
}
