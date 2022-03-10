package com.hwd.example.service;

import com.hwd.example.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}
