package com.yapp.kindpickyeating.service;

import com.yapp.kindpickyeating.domain.RestaurantTb;
import com.yapp.kindpickyeating.dto.MapRequestRestaruantDto;
import com.yapp.kindpickyeating.dto.MapResponseRestaurantDto;

public interface RestaurantService {

	MapResponseRestaurantDto getRestaurantList(MapRequestRestaruantDto locationDto);
	RestaurantTb getRestaurantDetail(Long id);
}
