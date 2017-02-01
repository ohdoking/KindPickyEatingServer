package com.yapp.kindpickyeating;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yapp.kindpickyeating.dao.RestaurantDao;
import com.yapp.kindpickyeating.domain.RestaurantTb;
import com.yapp.kindpickyeating.dto.MapRequestRestaruantDto;
import com.yapp.kindpickyeating.dto.MapResponseRestaurantDto;
import com.yapp.kindpickyeating.service.RestaurantService;
import com.yapp.kindpickyeating.service.UserService;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	
	@Autowired 
	RestaurantService restaurantService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public @ResponseBody MapResponseRestaurantDto list(@RequestParam("latitute") String latitute, @RequestParam("longitute") String longitute) {
	    
		logger.info(latitute + " : " + longitute); 
		MapRequestRestaruantDto mapRequestRestaruantDto = new MapRequestRestaruantDto();
		mapRequestRestaruantDto.setLatitue(Double.valueOf(latitute));
		mapRequestRestaruantDto.setLongitute(Double.valueOf(longitute));

		MapResponseRestaurantDto mapResponseRestaurantDto = restaurantService.getRestaurantList(mapRequestRestaruantDto);
	         
	    return mapResponseRestaurantDto; 
	}
	
	@RequestMapping(value="/detail/{id}", method = RequestMethod.GET)
	public @ResponseBody RestaurantTb detailItem(@PathVariable("id") Long id) {

		RestaurantTb restaurantTb = restaurantService.getRestaurantDetail(id);
		
		if(restaurantTb == null){
			restaurantTb = new RestaurantTb();
			restaurantTb.setId(0L);
		}
	    return restaurantTb; 
	}
	
	@RequestMapping(value="/comment/{id}", method = RequestMethod.GET)
	public @ResponseBody Map<String , Object> comment() {
	    Map<String, Object> jsonObject = new HashMap<String, Object>();
	         
	    jsonObject.put("success", true);
	    jsonObject.put("total_count", 10);
	    jsonObject.put("title", "wowTitle");
	         
	    return jsonObject; 
	}
	
	@RequestMapping(value="/comment/{id}", method = RequestMethod.GET)
	public @ResponseBody Map<String , Object> insertComment() {
	    Map<String, Object> jsonObject = new HashMap<String, Object>();
	         
	    jsonObject.put("success", true);
	    jsonObject.put("total_count", 10);
	    jsonObject.put("title", "wowTitle");
	         
	    return jsonObject; 
	}

}
