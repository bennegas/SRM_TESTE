package br.com.srm.projeto.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="TB_TP_RISCO")
public class TipoRisco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="TP_RISCO", nullable=false, length=1)
	private String nome;
	
	@Column(name="VL_JUROS", nullable=false, length=3, precision=2)
	private BigDecimal juros;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getJuros() {
		return juros;
	}

	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}
	
}
