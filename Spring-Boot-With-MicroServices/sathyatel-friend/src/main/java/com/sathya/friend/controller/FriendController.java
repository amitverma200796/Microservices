package com.sathya.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.friend.service.FriendService;

@RestController
public class FriendController {

	@Autowired
	private FriendService service;
	
	@GetMapping(value="/friends/{phoneNo}",produces="application/json")
   
	public List<Long> getFriends(@PathVariable Long phoneNo){
	System.out.println("******Fetching Friends*********");
	
		return service.getFriend(phoneNo);
	}
}
