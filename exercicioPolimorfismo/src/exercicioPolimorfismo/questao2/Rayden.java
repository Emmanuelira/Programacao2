package exercicioPolimorfismo.questao2;

public class Rayden extends Lutador{
	
	public Rayden(String nome, int vida) {
		super(nome, vida);
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 9;
	}

}
