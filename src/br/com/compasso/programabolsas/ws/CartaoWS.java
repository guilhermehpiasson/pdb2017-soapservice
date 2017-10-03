package br.com.compasso.programabolsas.ws;

import java.text.SimpleDateFormat;
import java.util.Collection;

import br.com.compasso.programabolsas.dao.BandeiraDAO;
import br.com.compasso.programabolsas.model.Bandeira;
import br.com.compasso.programabolsas.model.RetornoCartaoDeCredito;

public class CartaoWS {
	
	public Collection<Bandeira> BANDEIRAS = new BandeiraDAO().buscaTodasAsBandeiras();

	public RetornoCartaoDeCredito validaCartao(br.com.compasso.programabolsas.model.CartaoDeCredito cartaoDeCredito){
		
		if(cartaoDeCredito.getNroCartao().replaceAll(" ","").length() != 16){
			return new RetornoCartaoDeCredito(false, "Nro Inv�lido");
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		sdf.setLenient(false);

		try {
			sdf.parse(cartaoDeCredito.getDtValidade());
		} catch(Exception e) {
			return new RetornoCartaoDeCredito(false, "Data de Validade Inv�lida");
		}
		
		
		boolean bandeiraValida = false;
		for (Bandeira bandeira : BANDEIRAS) {
			if (bandeira.getNome().equalsIgnoreCase(cartaoDeCredito.getBandeira())){
				bandeiraValida = true;
			}
		}
		
		if(!bandeiraValida){
			return new RetornoCartaoDeCredito(false, "Bandeira Inv�lida");
		}
		
		if(cartaoDeCredito.getCodigoVerificador().length() != 3){
			return new RetornoCartaoDeCredito(false, "O c�digo deve possuir 3 d�gitos");
		}
		
		if(cartaoDeCredito.getNomeTitular().isEmpty()){
			return new RetornoCartaoDeCredito(false, "Todo cart�o deve possuir um nome de titular");
		}
		
		return new RetornoCartaoDeCredito(true, "Cart�o Valido");
	}
}
