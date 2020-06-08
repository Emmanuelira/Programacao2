package exercicioClassesAbstratas.questao1;

public class Quadrado extends Quadrilatero{

	public Quadrado(Cor cor, double lado) {
		super(cor, lado);
	}

	@Override
	public double calculaArea() {			
		return getLado1()*getLado1();
	}

	@Override
	public double calculaPerimetro() {
		return getLado1()*4;
	}
	
}
