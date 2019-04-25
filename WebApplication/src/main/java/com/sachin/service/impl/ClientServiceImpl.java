package com.sachin.service.impl;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.sachin.feign.ClientApplicationProxy;
import com.sachin.model.Client;
import com.sachin.service.ClientService;


@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ClientApplicationProxy clientApplicationProxy;

	@Transactional
	public String  callClientApp(Client client) {

		String url = "http://nibc2790.nousinfo.com:8089/api/clients";

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Client> request = new HttpEntity<Client>(client,headers);

		String response = restTemplate.exchange(url, HttpMethod.POST, request, String.class).getBody();
		return response;
	}

}
