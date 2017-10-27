package com.ado.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ado.demo.domian.City;
import com.ado.demo.mapper.CityMapper;

@RestController
public class CityController {
      @Autowired
      private CityMapper cityMapper;
     
      //获取所有城市列表
      @RequestMapping("citylist")
      public List<City> findAll(){
     	 return cityMapper.findAll();
      }
      
      
     @RequestMapping("citys")
     public City findOneCity(int provinceId){
    	 return cityMapper.findOneCity(provinceId);
     }
}
