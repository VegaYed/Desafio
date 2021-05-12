package com.example.desafio.services;

public interface IServiceFarmaciaClient {

	String callGetAllFarmacias();
	
	String callGetAllFarmaciasByComunaId(String id);
	
}
