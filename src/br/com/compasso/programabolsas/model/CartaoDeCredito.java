package br.com.compasso.programabolsas.model;

public class CartaoDeCredito {
	
	public String nroCartao;
	public String dtValidade;
	public String bandeira;
	public String codigoVerificador;
	public String nomeTitular;
	
	public CartaoDeCredito() {
		super();
	}
	
	public CartaoDeCredito(String nroCartao, String dtValidade, String bandeira, String codigoVerificador, String nomeTitular) {
		super();
		this.nroCartao = nroCartao;
		this.dtValidade = dtValidade;
		this.bandeira = bandeira;
		this.codigoVerificador = codigoVerificador;
		this.nomeTitular = nomeTitular;
	}

	public String getNroCartao() {
		return nroCartao;
	}

	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}

	public String getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	@Override
	public String toString() {
		return "Cartao [nroCartao=" + nroCartao 
				+ ", dtValidade=" + dtValidade 
				+ ", bandeira=" + bandeira
				+ ", codigoVerificador=" + codigoVerificador 
				+ ", nomeTitular=" + nomeTitular + "]";
	}
	
	
}
