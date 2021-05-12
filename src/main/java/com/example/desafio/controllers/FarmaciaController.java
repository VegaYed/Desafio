package com.example.desafio.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.services.IServiceFarmaciaClient;

@RestController
@RequestMapping("/farmacias")
public class FarmaciaController {
	
	@Autowired
	private IServiceFarmaciaClient farmaciaClient;
	
	/*
	@GetMapping()
	public String getAllFarmacias(){
		return farmaciaClient.callGetAllFarmacias();
	}
	*/
	
	@GetMapping()
	public String getAllFarmaciasByComunaId(@PathParam("local_id") String id) {
		return farmaciaClient.callGetAllFarmaciasByComunaId(id);
	}
}
