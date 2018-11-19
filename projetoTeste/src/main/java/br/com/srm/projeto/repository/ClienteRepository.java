package br.com.srm.projeto.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.srm.projeto.model.Cliente;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long>  {

	
}
