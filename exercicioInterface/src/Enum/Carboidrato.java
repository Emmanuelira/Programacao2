package Enum;

public enum Carboidrato {
	
	FEIJAO(5, "Feijão"), ARROZ(2.5, "Arroz"), PURE(2, "Purê"), BATATA(5, "Batata"), 
	PAO(1.5, "Pão"), TAPIOCA(4.5, "Tapioca");
	
	private double valor;
	private String nome;
	private Carboidrato (double valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getNome() {
		return nome;
	}
	
}
