package br.com.srm.projeto.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import br.com.srm.projeto.dto.request.RequestDTO;
import br.com.srm.projeto.dto.response.ResponseDTO;
import br.com.srm.projeto.model.Cliente;
import br.com.srm.projeto.model.TipoRisco;
import br.com.srm.projeto.repository.ClienteRepository;
import br.com.srm.projeto.repository.TipoRiscoRepository;
import br.com.srm.projeto.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TipoRiscoRepository tipoRiscoRepository;

	
	@Override
	public ResponseDTO calcularTaxaJuros(RequestDTO request) throws Exception {
		
		ResponseDTO retorno = new ResponseDTO();
		
		Optional<TipoRisco> optRisco = tipoRiscoRepository.findById(request.getRisco());
		
		if(optRisco.isPresent()) {
			Cliente cli = new Cliente();
			TipoRisco tpRisco = optRisco.get();
			
			cli.setRisco(tpRisco);
			cli.setLimiteCredito(request.getLimiteCredito());
			cli.setNome(request.getNome());
			
			clienteRepository.save(cli);
			
			retorno.setHttpStatus(HttpStatus.OK.value());
			
		}else {
			retorno.setErro("Tipo Risco não encontrado");
			retorno.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		}
		
		return retorno;
	}

}
