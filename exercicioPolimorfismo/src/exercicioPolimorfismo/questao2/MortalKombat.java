package exercicioPolimorfismo.questao2;

import java.util.Random;

public class MortalKombat {
	
	private Lutador a, b;
	
	public MortalKombat(Lutador a, Lutador b) {
		this.a = a;
		this.b = b;
	}
	
	public void fight() {
		
		while(a.vida > 0 && b.vida > 0) {
			
			Lutador daVez = a;
			Lutador sofredor = b;
			Random rand = new Random();
			int sortLutador = rand.nextInt(2);
			
			if (sortLutador == 0) {
				daVez = b;
				sofredor = a;
			}
			
			int sortGolpe = rand.nextInt(4);
			
			switch(sortGolpe) {
				case 0:
					daVez.socar(sofredor);
					break;
				case 1:
					daVez.chutar(sofredor);
					break;
				case 2:
					daVez.atirar(sofredor);
					break;
				case 3:
					daVez.lancarMagia(sofredor);
					break;
				
			}
			
		}
		
		if (a.vida <= 0) {
			System.out.printf("Vitória do(a) %s", b.nome);
		} else {
			System.out.printf("Vitória do(a) %s", a.nome);
		}
	}
	
	
	


}
