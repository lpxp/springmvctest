package com.springmvctest.service;

import com.springmvctest.pojo.DefenseStrategy;

import java.util.List;

public interface DefenseZoneService {
    String deploy(List<DefenseStrategy> strategyList);
    void save();
}
