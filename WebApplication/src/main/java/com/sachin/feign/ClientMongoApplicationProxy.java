package com.sachin.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sachin.model.Client;

@FeignClient(name="CLIENT-APPLICATION", url="localhost:8089")
public interface ClientMongoApplicationProxy {
	
	@GetMapping("/mongoapi/clients")
	public List<Client> retrieveClients();
	
	@GetMapping("/mongoapi/client/{clientId}")
	public Client getClient(@PathVariable(name="clientId") Long clientId);
	
	@PostMapping("/mongoapi/clients")
	public String saveClient(@RequestBody Client client);
	
	@DeleteMapping("/mongoapi/client/{clientId}")
	public String deleteClient(@PathVariable(name="clientId")Long clientId);
	
	@PutMapping("/mongoapi/client/{clientId}")
	public void updateClient(@RequestBody Client client,@PathVariable(name="clientId")Long clientId);

}
