package exercicioPolimorfismo.questao2;

public class Sonia extends Lutador{

	public Sonia(String nome, int vida) {
		super(nome, vida);
	}

	@Override
	public void socar(Lutador l) {
		super.socar(l);
		l.vida -= 8;
	}
	
	@Override
	public void chutar(Lutador l) {
		super.chutar(l);
		l.vida -= 8;
	}
	
}
