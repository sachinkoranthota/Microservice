package com.sachin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.model.Client;
import com.sachin.repo.ClientRepository;
import com.sachin.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/api/clients")
	public List<Client> retrieveClients(){
		return clientService.retrieveClients();
	}
	
	@GetMapping("/api/client/{clientId}")
	public Client getClient(@PathVariable(name="clientId") Long clientId) {
		return clientService.getClient(clientId);
	}
	
	@PostMapping("/api/clients")
	public String saveClient(@RequestBody Client client) {	
		clientService.saveClient(client);
		System.out.println("======================================================================================================");
		System.out.println(client);
		System.out.println("======================================================================================================");
		return "Cleint data Saved Successfully";
	}
	
	@DeleteMapping("/api/client/{clientId}")
	public String deleteClient(@PathVariable(name="clientId")Long clientId) {
		clientService.deleteClient(clientId);
		return "Cleint id: "+ clientId +" deleted Successfully";
	}
	
	@PutMapping("/api/client/{clientId}")
	public void updateClient(@RequestBody Client client,@PathVariable(name="clientId")Long clientId) {
		
		Client varClient = clientService.getClient(clientId);
		
		if(varClient!=null) {
		clientService.updateClient(client);
		System.out.println("Cleint data updated Successfully");
		}
		
		System.out.println("Cleint data updation failed");
	}
	
}
