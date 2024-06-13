package com.demo.controller;


import com.demo.entity.City;
import com.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {


    @Autowired
    private CityService cityService;


    @GetMapping("/list")
    public List<City> listByUsername(){
        return cityService.list();
    }

}
