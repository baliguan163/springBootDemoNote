package com.ado.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.ado.demo.domian.City;


@Mapper
public interface CityMapper {
   
	@Select("select * from city")  
    List<City> findAll();  
	
	@Select("select * from city where province_id = #{provinceId}")  
    City findOneCity(int provinceId);  
	
	
}
