package com.example.demo.service;

import com.example.demo.entity.homework;
import com.example.demo.mapper.HomMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomService {
    final HomMapper homMapper;

    public HomService(HomMapper homMapper) {
        this.homMapper = homMapper;
    }

    public List<homework> findAll(){
        return homMapper.findAll();
    }
    public void submit(homework hom){
        homMapper.save(hom);
    }
   }
