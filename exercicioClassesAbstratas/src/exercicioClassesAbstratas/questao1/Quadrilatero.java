package exercicioClassesAbstratas.questao1;

public abstract class Quadrilatero extends Figura{

	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Quadrilatero(Cor cor, double lado1, double lado2,
			double lado3, double lado4) {
		this(cor, lado1, lado2);
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public Quadrilatero(Cor cor, double lado1) {
		super(cor);
		this.lado1 = lado1;
	}
	
	public Quadrilatero(Cor cor, double lado1, double lado2) {
		this(cor, lado1);
		this.lado2 = lado2;
	}
	
	public double getLado1() {
		return lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double getLado3() {
		return lado3;
	}
	
	public double getLado4() {
		return lado4;
	}
	
}
