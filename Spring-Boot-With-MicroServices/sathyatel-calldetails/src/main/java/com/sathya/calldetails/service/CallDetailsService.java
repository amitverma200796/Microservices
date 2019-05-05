package com.sathya.calldetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.calldetails.dto.CallDetailsDTO;
import com.sathya.calldetails.entity.CallDetails;
import com.sathya.calldetails.repository.CallDetailsRepository;

@Service
public class CallDetailsService {

	@Autowired
	CallDetailsRepository repo;
	 public  List<CallDetailsDTO>  getCallDetailsByCalledBy(Long calledBy) {
		List<CallDetails>   list =repo.findByCalledBy(calledBy);
		List<CallDetailsDTO> list2 = new  ArrayList<CallDetailsDTO>();
		for(CallDetails  cd : list) {
			CallDetailsDTO  dto = new  CallDetailsDTO();
			dto.setCallId(cd.getCallId());
			dto.setCalledBy(cd.getCalledBy());
			dto.setCalledTo(cd.getCalledTo());
			dto.setCalledOn(cd.getCalledOn());
			dto.setDuration(cd.getDuration());
			list2.add(dto);
		}
		return  list2;
	}
	
	
}
