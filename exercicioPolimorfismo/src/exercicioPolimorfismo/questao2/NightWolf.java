package exercicioPolimorfismo.questao2;

public class NightWolf extends Lutador{
	
	public NightWolf(String nome, int vida) {
		super(nome, vida);
	}

	@Override
	public void atirar(Lutador l) {
		super.atirar(l);
		l.vida -= 5;
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 6;
	}

}
