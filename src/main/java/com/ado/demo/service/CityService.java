package com.ado.demo.service;
import com.ado.demo.domian.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CityService {
    City getByProvinceId(Long provinceId);
    List<City> getAll();
}



//package com.ado.demo.mapper;
//        import java.util.List;
//        import org.apache.ibatis.annotations.Mapper;
//        import org.apache.ibatis.annotations.Select;
//        import com.ado.demo.domian.City;

//@Mapper
//public interface CityMapper {
//    City findByProvinceId(Long provinceId);
//    List<City> findAll();
//}
//    定义这个 mapper 的作用是用来跟数据库进行交互的。
//        请注意，这里我把 @Mapper注解给注释掉了，大家先把这个注释打开，待会再来解释。

//另外，如果你想使用注解的方式来操作数据库，那么可以这样来定义 mapper：
////@Mapper
//public interface CityMapper {
//    @Select("select * from city where province_id = #{provinceId}")
//    // 返回结果实体属性与数据库字段转换
//    @Results({
//            @Result(property = "provinceId", column = "province_id"),
//            @Result(property = "cityName", column = "city_name")
//    })
//    City findByProvinceId(@Param("provinceId") Long provinceId);
//}
//对于选择使用注解还是使用 xml 的方式，大家可以灵活选择，比如简单的语句可以使用注解，复杂的语句使用 xml，当然，
//        还是需要跟团队保持一致。

//@Mapper
//public interface CityMapper {
//	@Select("select * from city")
//    List<City> findAll();
//
//	@Select("select * from city where province_id = #{provinceId}")
//    City findOneCity(int provinceId);
//}
