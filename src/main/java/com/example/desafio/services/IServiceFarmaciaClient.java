package com.example.desafio.services;

public interface IServiceFarmaciaClient {

	String callGetAllFarmaciasByRegionId(Integer id);
	
	String callGetAllFarmaciasByRegionIdAndComuna(Integer regionId, String comuna);
	
}
