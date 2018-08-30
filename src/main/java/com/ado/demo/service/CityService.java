package com.ado.demo.service;
import com.ado.demo.domian.City;
import java.util.List;

public interface CityService {
    City getByProvinceId(Long provinceId);
    List<City> getAll();
}