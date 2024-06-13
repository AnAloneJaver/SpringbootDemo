package com.demo.service.impl;

import com.demo.entity.City;
import com.demo.mapper.CityMapper;
import com.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {


    @Autowired
    CityMapper cityMapper;

    @Override
    public List<City> list() {
        return cityMapper.list();
    }
}
