package com.yapp.kindpickyeating;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yapp.kindpickyeating.dto.LoginDto;
import com.yapp.kindpickyeating.dto.UserDto;
import com.yapp.kindpickyeating.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired 
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserDto login(@RequestParam("email") String email, @RequestParam("pw") String pw) {
	         
		logger.info("login : "+email+pw);
		
		LoginDto loginDto = new LoginDto();
		loginDto.setEmail(email);
		loginDto.setPw(pw);
		
		UserDto userDto = userService.login(loginDto);
		
//		Map<String, Object> jsonObject = new HashMap<String, Object>();
//		if(userDto.getEmail() != null){
//			jsonObject.put("state", "success");
//		}
//		else{
//			jsonObject.put("state", "fail");
//		}
		
	    return userDto; 

	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public Map<String , Object> join(@RequestParam("email") String email) {
		logger.info(email);
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
			jsonObject.put("state", "success");
	    
	    return jsonObject; 
	    
	
	}	
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public Map<String , Object> join(@RequestBody UserDto paramMap) {
		logger.info("join : "+ paramMap.getEmail());
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
			
			
		Integer result = userService.join(paramMap);
		
		if(result == 1){
			jsonObject.put("state", "success");
		}
		else{
			jsonObject.put("state", "fail");
		}
	    
	    return jsonObject; 
	    
	
	}
	
}
