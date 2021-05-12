package com.example.desafio.services;

public interface IServiceFarmaciaClient {

	String callGetAllFarmacias();
	
	String callGetAllFarmaciasByRegionId(Integer id);
	
}
