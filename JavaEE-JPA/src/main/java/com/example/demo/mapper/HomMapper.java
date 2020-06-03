package com.example.demo.mapper;

import com.example.demo.entity.homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomMapper extends JpaRepository<homework,Long> {
}
