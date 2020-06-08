package exercicioPolimorfismo.questao2;

public class Main {

	public static void main(String[] args) {
		
		Lutador sZ = new SubZero("geladinho", 50);
		Lutador lK = new LiuKang("foguinho", 50);
		
		MortalKombat mK = new MortalKombat(lK, sZ);
		mK.fight();
		
	}

}
