package com.devhoss.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.devhoss.model.Cliente;
import com.devhoss.model.ClienteDetalle;
import com.devhoss.model.Historico;

@RestController
public class ClienteServiceController {

	Logger logger = LoggerFactory.getLogger(ClienteServiceController.class);

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.GET)
	public ClienteDetalle getCLientes(@PathVariable int id)
	{
		logger.info("REQUEST:" + id);

		Cliente cliente = new Cliente(id,"Hossmell velasco",30);

		ResponseEntity<List<Historico>> response = restTemplate.exchange("http://rcc-service/historico/{id}",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Historico>>() {}, id);
		List<Historico> historico = response.getBody();
		ClienteDetalle clienteDetalle = new ClienteDetalle(cliente,historico);

		logger.info("RESPONSE: " + clienteDetalle);

		return clienteDetalle;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
