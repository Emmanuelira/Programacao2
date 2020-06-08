package exercicioClassesAbstratas.questao1;

public class Trapezio extends Quadrilatero{
	
	private double altura;

	public Trapezio(Cor cor, double baseMenor, double baseMaior,
			double lado3, double lado4, double altura) {
		super(cor, baseMenor, baseMaior, lado3, lado4);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}
	
	@Override
	public double calculaArea() {
		return (getLado1() + getLado2()*altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		return getLado1() + getLado2() + getLado3() + getLado4();
	}
	
}
