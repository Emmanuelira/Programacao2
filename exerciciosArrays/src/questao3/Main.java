package questao3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		CampeonatoFutebol paraibano = new CampeonatoFutebol();
		
		paraibano.adicionarTimes("Campinense Treze Botafogo Autoesporte Serrano");
		System.out.println(Arrays.toString(paraibano.criarCampeonato()));
		
		
	}

}
