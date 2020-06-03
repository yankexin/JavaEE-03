package com.example.demo.mapper;

import com.example.demo.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuMapper extends JpaRepository<student,Long> {
}
