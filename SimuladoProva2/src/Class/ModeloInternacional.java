package Class;

import Interface.EstrategiaCitacao;

public class ModeloInternacional implements EstrategiaCitacao{

	@Override
	public String getCitacao(Artigo artigo) {
		String citacao = "";
		citacao += artigo.getAutor().getUltimoNome().toUpperCase() + ", ";
		citacao += artigo.getAutor().getPrimeiroNome().substring(0,1).toUpperCase() + ".";
		citacao += artigo.getAutor().getNomeDoMeio().substring(0,1).toUpperCase() + "., ";
		citacao += artigo.getTitulo() + ", ";
		citacao += artigo.getAno() + ".";	
		return citacao;
	}
	
}
