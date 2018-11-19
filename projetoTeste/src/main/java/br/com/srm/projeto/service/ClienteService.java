package br.com.srm.projeto.service;

import br.com.srm.projeto.dto.request.RequestDTO;
import br.com.srm.projeto.dto.response.ResponseDTO;

public interface ClienteService {

	ResponseDTO calcularTaxaJuros(RequestDTO request);
	
}
