package br.com.srm.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.srm.projeto.dto.request.RequestDTO;
import br.com.srm.projeto.dto.response.ResponseDTO;
import br.com.srm.projeto.service.ClienteService;

@RestController(value="/cliente")
@EnableAutoConfiguration
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	
	@PostMapping
	public ResponseDTO calcularTaxa (@RequestBody RequestDTO request) {
		
		return service.calcularTaxaJuros(request);
	}

}
