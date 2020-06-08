package exercicioPolimorfismo.questao2;

public class Jax extends Lutador{
	
	public Jax(String nome, int vida) {
		super(nome, vida);
	}

	@Override
	public void socar(Lutador l) {
		super.socar(l);
		l.vida -= 10;
	}
	
}
