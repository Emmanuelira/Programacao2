package questao1;
import java.util.*;

public class ListaMathUtils {
	
	public static List<Integer> calculaDivisores (int num) {
		
		List<Integer> divisores = new ArrayList<Integer>();
		
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}

	public static double computaMaior (List<Double> numeros) {
		
		double maior = numeros.get(0);
		
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) > maior) {
				maior = numeros.get(i);
			}
		}
		return maior;		
	}
	
	public static double computaMenor (List<Double> numeros) {
		
	double menor = numeros.get(0);
		
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i) < menor) {
				menor = numeros.get(i);
			}
		}
		return menor;	
	}
	
	public static double computaMedia (List<Double> numeros) {
		
		double soma = 0.0;
		
		for (int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);
		}
		return soma/numeros.size();
	}
	
	public static boolean temNumRepetido (List<Double> numeros) {
		
		for (int referencia = 0; referencia < numeros.size() - 1; referencia++) {
			for (int elemento = referencia + 1; elemento < numeros.size(); elemento++) {
				if (numeros.get(referencia).equals(numeros.get(elemento)) ) {
					return true;
				}
			}
		}
		return false;
	}

}


	