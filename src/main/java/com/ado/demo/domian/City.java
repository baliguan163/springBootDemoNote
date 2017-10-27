package com.ado.demo.domian;

/**
 * 城市实体类
 *
 */
public class City {
 
    /**
     * 城市编号
     */
    private Long id;
 
    /**
     * 省份编号
     */
    private Long province_id;
 
    /**
     * 城市名称
     */
    private String city_name;
 
    /**
     * 描述
     */
    private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProvince_id() {
		return province_id;
	}

	public void setProvince_id(Long province_id) {
		this.province_id = province_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 
   
}
