package com.example.desafio.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.desafio.services.IServiceFarmaciaClient;

@Service("farmaciaClient")
public class ServiceFarmaciaClientImpl implements IServiceFarmaciaClient{
	
	private static final String GET_ALL_BY_REGION_ID = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region={region}";
	private static final String GET_ALL_BY_REGION_ID_AND_COMUNA = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region={region}&comuna_nombre={comuna}";
    static RestTemplate restTemplate = new RestTemplate();


	@Override
	public String callGetAllFarmaciasByRegionId(Integer id) {
		Map<String, Integer> param = new HashMap<>();
		param.put("region", id);
		return restTemplate.getForObject(GET_ALL_BY_REGION_ID, String.class, param);
	}

	@Override
	public String callGetAllFarmaciasByRegionIdAndComuna(Integer regionId, String comuna) {
		return restTemplate.getForObject(
				GET_ALL_BY_REGION_ID_AND_COMUNA, String.class, regionId, comuna);
	}

}
