package Enum;

public enum SaborBebida {

	GUARANA_ANTARTICA(7, "Guaran� Antartica"), COCA_COLA(8, "Coca Cola"), FANTA_LARANJA(4, "Fanta Laranja"), 
	SPRITE(5, "Sprite"), SUCO_LARANJA(5, "Suco de Laranja"), SUCO_ACEROLA(5, "Suco de Acerola"),
	AGUA_TONICA(6, "�gua T�nica"), BUDWEISER(7, "Budweiser"), HEINEKEN(10, "Heineken"),	AGUA(2, "�gua");
	
	private double valor;
	private String nome;
	private SaborBebida (double valor, String nome) {
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
