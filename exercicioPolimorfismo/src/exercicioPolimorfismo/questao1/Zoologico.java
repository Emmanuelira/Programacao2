package exercicioPolimorfismo.questao1;

import java.util.ArrayList;

public class Zoologico {
	
	public static void main (String[] args) {
		
		Animal[] jaulas = new Animal[5];
		
		Cachorro pitbull = new Cachorro("PitBull", 8);
		jaulas[0] = pitbull;
		
		Cachorro viraLata = new Cachorro("Vira-Lata", 12);
		jaulas[1] = viraLata;
		
		Cavalo jonas = new Cavalo("Jonas", 4);
		jaulas[2] = jonas;
		
		Preguica mongo = new Preguica("Mongo", 65);
		jaulas[3] = mongo;
		
		Cavalo luis = new Cavalo("Luis", 13);
		jaulas[4] = luis;
		
		for (int i = 0; i < jaulas.length; i++) {
			jaulas[i].emitirSom();
			if (jaulas[i] instanceof Preguica) {
				((Preguica) jaulas[i]).escalarArvore();
			} else if (jaulas[i] instanceof Cachorro) {
				((Cachorro) jaulas[i]).correr();
			} else {
				((Cavalo) jaulas[i]).correr();
			}
			
			
		}
		
		
	}
	
	
	
}
