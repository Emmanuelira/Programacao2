package exercicioPolimorfismo.questao2;

public class LiuKang extends Lutador{
	
	public LiuKang(String nome, int vida) {
		super(nome, vida);
	}

	@Override
	public void chutar(Lutador l) {
		super.chutar(l);
		l.vida -= 9;
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 8;
	}

}
