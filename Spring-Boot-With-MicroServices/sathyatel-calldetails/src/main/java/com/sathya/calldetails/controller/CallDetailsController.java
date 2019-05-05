package com.sathya.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.calldetails.dto.CallDetailsDTO;
import com.sathya.calldetails.service.CallDetailsService;

@RestController
public class CallDetailsController {
@Autowired
private CallDetailsService service;

@GetMapping(value="/calldetails/{calledby}", produces="application/json")
public List<CallDetailsDTO> getCallDetailsByCalledBy(@PathVariable Long calledby){
	
	return service.getCallDetailsByCalledBy(calledby);
}



}
