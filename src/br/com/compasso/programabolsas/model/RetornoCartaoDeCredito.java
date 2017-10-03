package br.com.compasso.programabolsas.model;

public class RetornoCartaoDeCredito {
	
	public boolean valido;
	
	public String msg;
	
	public RetornoCartaoDeCredito(boolean valido, String msg) {
		super();
		this.valido = valido;
		this.msg = msg;
	}
	
	public RetornoCartaoDeCredito() {
		super();
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
