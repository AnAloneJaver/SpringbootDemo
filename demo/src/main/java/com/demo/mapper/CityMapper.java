package com.demo.mapper;

import com.demo.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

    List<City> list();
}
