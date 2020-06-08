package exercicioClassesAbstratas.questao1;

public class Circulo extends Figura {

	private static double pi = 3.14159265359;
	private double raio;
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	@Override
	public double calculaArea() {
		return pi*Math.pow(raio,2);
	}

	@Override
	public double calculaPerimetro() {
		return 2*pi*raio;
	}

}
