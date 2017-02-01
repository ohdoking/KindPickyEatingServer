package com.yapp.kindpickyeating.dto;

import java.util.ArrayList;

public class MapResponseRestaurantDto {

	public String state;
	public ArrayList<MapRestaurantDto> list;
	
	public MapResponseRestaurantDto(){
		list = new ArrayList<MapRestaurantDto>();
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public ArrayList<MapRestaurantDto> getList() {
		return list;
	}
	public void setList(ArrayList<MapRestaurantDto> list) {
		this.list = list;
	}
	
	
}
