package com.sathya.plan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.plan.dto.PlanDTO;
import com.sathya.plan.entity.Plan;
import com.sathya.plan.repository.PlanRepository;

@Service
public class PlanService {
  
	@Autowired 
	private PlanRepository repo;
	public List<PlanDTO> getAllPlans(){
		List<Plan> list=repo.findAll();
		List<PlanDTO> list2=new ArrayList<PlanDTO>();
		for(Plan  p : list) {
			PlanDTO  dto = new  PlanDTO();
			dto.setPlanId(p.getPlanId());
			dto.setPlanName(p.getPlanName());
			dto.setTenure(p.getTenure());
			list2.add(dto);
		}
		return   list2;	
	}
	
	public PlanDTO getSpecificPlan(Long planId) {
		
		Optional<Plan> p=repo.findById(planId);
		Plan  pp = p.get();
		PlanDTO  dto = new PlanDTO();
		dto.setPlanId(pp.getPlanId());
		dto.setPlanName(pp.getPlanName());
		dto.setTenure(pp.getTenure());
		return  dto;
	}

		
		
		
	
	
	
}
