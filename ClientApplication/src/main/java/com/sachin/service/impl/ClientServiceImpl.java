package com.sachin.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sachin.model.Client;
import com.sachin.repo.ClientRepository;
import com.sachin.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;

	@Transactional
	public List<Client> retrieveClients() {
		List<Client> listOfClients =  clientRepository.findAll();
		return listOfClients;
	}

	@Transactional
	public Client getClient(Long clientId) {
		Optional<Client> optClient = clientRepository.findById(clientId);
		return optClient.get();
	}

	@Transactional
	public void saveClient(Client client) {
		clientRepository.save(client);
	}

	@Transactional
	public void deleteClient(Long clientId) {
		clientRepository.deleteById(clientId);
	}

	@Transactional
	public void updateClient(Client client) {
		clientRepository.save(client);
	}

}
