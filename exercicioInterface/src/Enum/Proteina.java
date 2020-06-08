package Enum;

public enum Proteina {

	PICANHA(20.99, "Picanha"), MAMINHA(15.35, "Maminha"), FRANGO(15, "Frango"), 
	LINGUICA(10, "Linguiça"), ALCATRA(18.97, "Alcatra"), PORCO(8.012, "Porco");
	
	private double valor;
	private String nome;
	private Proteina (double valor, String nome) {
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
