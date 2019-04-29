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
import com.sachin.service.ClientMogoService;

@RestController
public class MongoController {
	
	@Autowired
	private ClientMogoService clientMogoService;
	
	@GetMapping("/mongoapi/clients")
	public List<Client> retrieveClients(){
		return clientMogoService.retrieveClients();
	}
	
	@GetMapping("/mongoapi/client/{clientId}")
	public Client getClient(@PathVariable(name="clientId") Long clientId) {
		return clientMogoService.getClient(clientId);
	}
	
	@PostMapping("/mongoapi/clients")
	public String saveClient(@RequestBody Client client) {	
		clientMogoService.saveClient(client);
		System.out.println("======================================================================================================");
		System.out.println(client);
		System.out.println("======================================================================================================");
		return "Cleint data Saved Successfully";
	}
	
	@DeleteMapping("/mongoapi/client/{clientId}")
	public String deleteClient(@PathVariable(name="clientId")Long clientId) {
		clientMogoService.deleteClient(clientId);
		return "Cleint id: "+ clientId +" deleted Successfully";
	}
	
	@PutMapping("/mongoapi/client/{clientId}")
	public void updateClient(@RequestBody Client client,@PathVariable(name="clientId")Long clientId) {
		
		Client varClient = clientMogoService.getClient(clientId);
		
		if(varClient!=null) {
			clientMogoService.updateClient(client);
		System.out.println("Cleint data updated Successfully");
		}
		
		System.out.println("Cleint data updation failed");
	}

}
