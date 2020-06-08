package questao6;

public class ValorMinimoParcelaException extends Exception{
	
	public ValorMinimoParcelaException() {
		super("Valor da parcela menor que o mínimo."
				+ "\nValor mínimo da parcela: " + Venda.getValorMinimo());
	}
}
