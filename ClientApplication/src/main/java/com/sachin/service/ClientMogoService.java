package com.sachin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sachin.model.Client;

@Service
public interface ClientMogoService {

	public List<Client> retrieveClients();

	public Client getClient(Long clientId);

	public void saveClient(Client client);

	public void deleteClient(Long clientId);

	public void updateClient(Client client);

}
