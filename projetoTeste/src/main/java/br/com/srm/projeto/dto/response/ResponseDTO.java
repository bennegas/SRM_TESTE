package br.com.srm.projeto.dto.response;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String erro;
	private String mensagem;
	private int   httpStatus;
	
	public String getErro() {
		return erro;
	}
	public void setErro(String erro) {
		this.erro = erro;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	

}
