package com.example.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.services.IServiceFarmaciaClient;

@RestController
@RequestMapping("/farmacias")
public class FarmaciaController {
	
	@Autowired
	private IServiceFarmaciaClient farmaciaClient;
	
	@GetMapping("/region")
	public String getAllFarmaciasByRegionId(@RequestParam Integer id_region) {
		return farmaciaClient.callGetAllFarmaciasByRegionId(id_region);
	}
	
	@GetMapping("/comuna")
	public String getAllFarmaciasByRegionIdAndComuna(@RequestParam Integer id_region, @RequestParam String comuna) {
		return farmaciaClient.callGetAllFarmaciasByRegionIdAndComuna(id_region, comuna);
	}
}
