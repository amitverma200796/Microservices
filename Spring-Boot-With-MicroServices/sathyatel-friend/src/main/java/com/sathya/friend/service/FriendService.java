package com.sathya.friend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.friend.entity.Friend;
import com.sathya.friend.repository.FriendRepository;

@Service
public class FriendService {
 
	@Autowired FriendRepository repo;
	public List<Long> getFriend(Long phoneNo){
		List<Friend> list=repo.findByPhoneNo(phoneNo);
		List<Long>list2=new ArrayList<Long>();
		for(Friend f: list)
		{
			list2.add(f.getFriendNo());
		}
		return list2;
	}
}
