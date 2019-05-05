package com.sathya.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.friend.entity.Friend;

public interface FriendRepository extends JpaRepository<Friend,Integer> {

	List<Friend>   findByPhoneNo(Long  phoneNo);	
}
