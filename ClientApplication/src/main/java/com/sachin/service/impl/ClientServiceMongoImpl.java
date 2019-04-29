package com.sachin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sachin.model.Client;
import com.sachin.repo.ClientMongoRepository;
import com.sachin.service.ClientMogoService;


public class ClientServiceMongoImpl implements ClientMogoService{

	@Autowired
	private ClientMongoRepository clientMongoRepository;

	@Override
	public List<Client> retrieveClients() {
		List<Client> listOfClients = clientMongoRepository.findAll();
		return listOfClients;
	}

	@Override
	public Client getClient(Long clientId) {
		Optional<Client> optClient = clientMongoRepository.findById(clientId.toString());
		return optClient.get();
	}

	@Override
	public void saveClient(Client client) {
		clientMongoRepository.save(client);
		
	}

	@Override
	public void deleteClient(Long clientId) {
		clientMongoRepository.deleteById(clientId.toString());
		
	}

	@Override
	public void updateClient(Client client) {
		clientMongoRepository.save(client);
		
	}

}
