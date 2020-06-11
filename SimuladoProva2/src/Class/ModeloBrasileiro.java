package Class;

import Interface.EstrategiaCitacao;

public class ModeloBrasileiro implements EstrategiaCitacao{

	@Override
	public String getCitacao(Artigo artigo) {
		String citacao = "";
		citacao += artigo.getAutor().getPrimeiroNome().toUpperCase() + " ";
		citacao += artigo.getAutor().getNomeDoMeio().substring(0,1).toUpperCase() + ". ";
		citacao += artigo.getAutor().getUltimoNome().toUpperCase() + ", ";
		citacao += artigo.getAno() + ", ";
		citacao += artigo.getTitulo() + ".";	
		return citacao;
	}

}
