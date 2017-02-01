package com.yapp.kindpickyeating.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yapp.kindpickyeating.dao.RestaurantDao;
import com.yapp.kindpickyeating.domain.RestaurantTb;
import com.yapp.kindpickyeating.dto.MapRequestRestaruantDto;
import com.yapp.kindpickyeating.dto.MapResponseRestaurantDto;
import com.yapp.kindpickyeating.dto.MapRestaurantDto;

@Repository
public class RestaurantDaoImp implements RestaurantDao {
	
	@Autowired
    private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

	@Override
	public MapResponseRestaurantDto getRestaurantList(MapRequestRestaruantDto locationDto) {
		List<RestaurantTb> list= sqlSession.selectList("getRestaurant",locationDto);
		
		MapResponseRestaurantDto data = new MapResponseRestaurantDto();
		
		if(list != null){
			data.setState("success");
			ArrayList<MapRestaurantDto> tempList = new ArrayList<MapRestaurantDto>();
			for(RestaurantTb restaurantTb : list){
				tempList.add(convertToTbFromDto(restaurantTb));
			}
			data.setList(tempList);
		}
		else{
			data.setState("fail");
		}
		
		return data;
	}
	
	@Override
	public RestaurantTb getRestaurantDetail(Long id) {
		return sqlSession.selectOne("getRestaurantDetail", id);
	}

	public MapRestaurantDto convertToTbFromDto(RestaurantTb list){
		MapRestaurantDto data = new MapRestaurantDto();
		data.setAddress(list.getAddress());
		data.setGrade("10");
		data.setId(list.getId());
		data.setLatatitue(list.getLatitute());
		data.setLongitute(list.getLongitute());
		data.setName(list.getName());
		data.setThumb(list.getThumb());
		return data;
		
	}

	
	
	


}
