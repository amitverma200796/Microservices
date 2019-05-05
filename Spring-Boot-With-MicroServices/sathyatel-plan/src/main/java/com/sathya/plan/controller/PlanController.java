package com.sathya.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.plan.dto.PlanDTO;
import com.sathya.plan.service.PlanService;

@RestController
public class PlanController {

	@Autowired 
	private PlanService service;

	@GetMapping(value="/plans",produces="application/json")
	public List<PlanDTO> getAllPlans(){
	return service.getAllPlans();
	
	
	}
	@GetMapping(value="/plans/{planId}",produces="application/json")
	public PlanDTO getSpecificPlan(@PathVariable Long planId) {
		return service.getSpecificPlan(planId);
		
		
	}
	
	
}
