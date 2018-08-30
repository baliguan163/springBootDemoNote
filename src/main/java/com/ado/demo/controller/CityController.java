package com.ado.demo.controller;
import java.util.List;

import com.ado.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ado.demo.domian.City;
import com.ado.demo.mapper.CityMapper;

import javax.annotation.Resource;
//控制器

@RestController
@RequestMapping("/api")
class CityRestController {
    @Resource
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> cities () {
        return cityService.getAll();
    }
    @GetMapping("/city/{provinceId}")
    public City city(@PathVariable long provinceId) {
        return cityService.getByProvinceId(provinceId);
    }
}

//@RestController
//public class CityController {
//      @Autowired
//      private CityMapper cityMapper;
//
////    @RequestMapping可在（）中自定义多个URL访问路径，写成集合的形式，即可多路径访问相同页面
//      //获取所有城市列表
//      @RequestMapping("citylist")
//      public List<City> findAll(){
//     	 return cityMapper.findAll();
//      }
//
//     @RequestMapping("citys")
//     public City findOneCity(int provinceId){
//    	 return cityMapper.findOneCity(provinceId);
//     }
//}
