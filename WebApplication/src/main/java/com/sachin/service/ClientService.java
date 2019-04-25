package com.sachin.service;

import org.springframework.stereotype.Service;

import com.sachin.model.Client;

@Service
public interface ClientService {
	
	public String callClientApp(Client client);

}
