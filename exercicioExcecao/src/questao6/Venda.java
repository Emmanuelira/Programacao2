package questao6;

public class Venda {
	private static double VALOR_MINIMO_PARCELA = 50.00;
	private double valor;
	private int qtdParcelas;

	public static double getValorMinimo () {
		return VALOR_MINIMO_PARCELA;
	}
	
	public Venda(double valor) {
		this.valor = valor;
	}

	public void setQtdParcelas(int qtdParcelas) throws ValorMinimoParcelaException{
		if (valor/qtdParcelas < 50) {
			throw new ValorMinimoParcelaException();
		}
		this.qtdParcelas = qtdParcelas;
	}

	public double getValorParcela() {
		return valor / qtdParcelas;
	}
}
