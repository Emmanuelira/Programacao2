package questao2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		SistemaInterpol sist = new SistemaInterpol();
		
		sist.adicionarProcurados("Fulano Beltrano Cicrano Joao");
		System.out.println(Arrays.toString(sist.procurados));
		
		System.out.println(sist.ehProcurado("Beltrano"));

	}

}
