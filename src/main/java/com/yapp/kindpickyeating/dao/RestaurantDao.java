package com.yapp.kindpickyeating.dao;

import java.util.ArrayList;

import com.yapp.kindpickyeating.domain.RestaurantTb;
import com.yapp.kindpickyeating.dto.MapRequestRestaruantDto;
import com.yapp.kindpickyeating.dto.MapResponseRestaurantDto;
import com.yapp.kindpickyeating.dto.MapRestaurantDto;

public interface RestaurantDao {
	
	MapResponseRestaurantDto getRestaurantList(MapRequestRestaruantDto locationDto);

	RestaurantTb getRestaurantDetail(Long id);
}
