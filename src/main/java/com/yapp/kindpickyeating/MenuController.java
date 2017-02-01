package com.yapp.kindpickyeating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yapp.kindpickyeating.domain.RestaurantTb;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public @ResponseBody RestaurantTb registerMenu() {

	    return null; 
	}

	@RequestMapping(value="/register/{id}", method = RequestMethod.GET)
	public @ResponseBody RestaurantTb getMenu(@PathVariable("id") Long id) {

	    return null; 
	}
	
	@RequestMapping(value="/favorite", method = RequestMethod.POST)
	public @ResponseBody RestaurantTb registerFavorite() {

	    return null; 
	}
	
	@RequestMapping(value="/favorite/{id}", method = RequestMethod.POST)
	public @ResponseBody RestaurantTb getFavorite(@PathVariable("id") Long id) {

	    return null; 
	}
}
