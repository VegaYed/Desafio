package com.example.desafio.controllers;

import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class ClientMin {
	
    private static final String GET_ALL_API = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";
    static RestTemplate restTemplate = new RestTemplate();
    
    
    private ResponseEntity<String> callGetAllFarmacias() {
    	
    	HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	
    	HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

    	return restTemplate.exchange(GET_ALL_API, HttpMethod.GET, entity, String.class);
    }
    
}
