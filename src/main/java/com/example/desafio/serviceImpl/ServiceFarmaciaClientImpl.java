package com.example.desafio.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.desafio.services.IServiceFarmaciaClient;

@Service("farmaciaClient")
public class ServiceFarmaciaClientImpl implements IServiceFarmaciaClient{
	
	private static final String GET_ALL_API = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region={q}";
    static RestTemplate restTemplate = new RestTemplate();

	@Override
	public String callGetAllFarmacias() {
    	return restTemplate.getForObject(GET_ALL_API, String.class);   	
	}

	@Override
	public String callGetAllFarmaciasByRegionId(Integer id) {
		return restTemplate.getForObject(GET_ALL_API, String.class, id);
	}

}
