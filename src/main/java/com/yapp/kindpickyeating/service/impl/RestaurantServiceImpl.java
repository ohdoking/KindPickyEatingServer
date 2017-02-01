package com.yapp.kindpickyeating.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yapp.kindpickyeating.dao.RestaurantDao;
import com.yapp.kindpickyeating.dao.UserDao;
import com.yapp.kindpickyeating.domain.RestaurantTb;
import com.yapp.kindpickyeating.dto.MapRequestRestaruantDto;
import com.yapp.kindpickyeating.dto.MapResponseRestaurantDto;
import com.yapp.kindpickyeating.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Resource
    private RestaurantDao restaurantDao;
	
	@Override
	public MapResponseRestaurantDto getRestaurantList(MapRequestRestaruantDto locationDto) {
		return restaurantDao.getRestaurantList(locationDto);
	}

	@Override
	public RestaurantTb getRestaurantDetail(Long id) {
		return restaurantDao.getRestaurantDetail(id);
	}

}
