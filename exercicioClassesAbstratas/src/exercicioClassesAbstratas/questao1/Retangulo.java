package exercicioClassesAbstratas.questao1;

public class Retangulo extends Quadrilatero {
	
	public Retangulo(Cor cor, double lado1, double lado2) {
		super(cor, lado1, lado2);
	}

	@Override
	public double calculaArea() {
		return getLado1()*getLado2();
	}

	@Override
	public double calculaPerimetro() {
		return (getLado1()*2) + (getLado2()*2);
	}
	
}
