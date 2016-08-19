package com.yapp.kindpickyeating;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String , Object> login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
	         
		logger.info("login",id,pw);
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		if(id.equals("jung") && pw.equals("1234")){
			jsonObject.put("state", "success");
		}
		else{
			jsonObject.put("state", "fail");
		}
	    
	    return jsonObject; 

	}
}
