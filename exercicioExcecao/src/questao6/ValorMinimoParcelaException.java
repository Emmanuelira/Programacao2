package questao6;

public class ValorMinimoParcelaException extends Exception{
	
	public ValorMinimoParcelaException() {
		super("Valor da parcela menor que o m�nimo."
				+ "\nValor m�nimo da parcela: " + Venda.getValorMinimo());
	}
}
