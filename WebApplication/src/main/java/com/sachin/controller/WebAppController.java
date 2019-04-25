package com.sachin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sachin.feign.ClientApplicationProxy;
import com.sachin.model.Client;
import com.sachin.service.ClientService;

@Controller
public class WebAppController {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	ClientApplicationProxy clientApplicationProxy;

    @GetMapping("/registration")
    public String greetingForm(Model model) {
        model.addAttribute("client", new Client());
        return "client";
    }

    @PostMapping("/registration")
	public String greetingSubmit(@ModelAttribute Client client) {
    	String result;
    	
    	String response = clientService.callClientApp(client);
    	if(null!=response) {
    		result= "registrationSuucess";
    		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+response+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	}
    	else
    		result = "unsuccessful";
    	
    	return result;
    }
    
    @PostMapping("/registrationfiegn")
   	public String greetingSubmitFeign(@ModelAttribute Client client) {
       	String result;
       	
       	String response = clientApplicationProxy.saveClient(client);
       	if(null!=response) {
       		result= "registrationSuucess";
       		System.out.println("==========================================================");
       		System.out.println(client);
       		System.out.println(response);
       		System.out.println("==========================================================");
       	}
       	else
       		result = "unsuccessful";
       	
       	return result;
       }

}