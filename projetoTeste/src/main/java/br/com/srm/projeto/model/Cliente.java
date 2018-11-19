package br.com.srm.projeto.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName="cliente_sequence", initialValue=1, name = "cliente_sequence")
	@Column(name="ID_CLIENTE", nullable=false, length=10)
	private long idCliente;
	
	@Column(name="NM_CLIENTE", nullable=false, length=30)
	private String nome; 
	
	@Column(name="VL_LIMIT_CRED", nullable=false, length=7, precision=2)
	private BigDecimal limiteCredito;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="TP_RISCO")
	private TipoRisco risco;

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

	public TipoRisco getRisco() {
		return risco;
	}

	public void setRisco(TipoRisco risco) {
		this.risco = risco;
	}
	

}
