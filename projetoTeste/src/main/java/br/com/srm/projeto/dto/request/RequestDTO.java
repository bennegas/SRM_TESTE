package br.com.srm.projeto.dto.request;

import java.io.Serializable;
import java.math.BigDecimal;

public class RequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private BigDecimal limiteCredito;
	
	private String risco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}
	
	

}
