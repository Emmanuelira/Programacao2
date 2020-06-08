package questao1;

public class ArrayMathUtils {
	
	public static int[] calculaDivisores (int num) {
		
		int quantDivisores = 0;
		int contador = 1;
		
		while (contador <= num) {
			if (num%contador == 0) {
				quantDivisores++;
			}
			contador++;
		}
		
		int[] resultado = new int[quantDivisores];
		int indice = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				resultado[indice] = i;
				indice++;
			}
		}
		
		return resultado;
		
	}

	public static double computaMaior(double[] numeros) {
		
		double maior = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		
		return maior;
			
	}
	
	public static double computaMenor(double[] numeros) {
		
		double menor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		return menor;
			
	}
		
	public static double computaMedia(double[] numeros)	{
		
		double soma = 0;
		for (double i : numeros) {
			soma += i;
		}
		
		return soma/numeros.length;
		
	}
		
	public static boolean temNumRepetido(double[] numeros) {
		
		for (int ref = 0; ref < numeros.length-1; ref++) {
			for (int seq = ref+1; seq < numeros.length; seq++) {
				if (numeros[ref] == numeros[seq]) {
					return true;
				}
			}
		}
		
		return false;
			
	}
				
	public static int[][] somaMatrizes (int[][] m1, int[][] m2) {
		
		int[][] resultado = new int[m1.length][m1[0].length];
		
		for (int linha = 0; linha < m1.length; linha++) {
			for(int coluna = 0; coluna < m1[0].length; coluna++) {
				resultado[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
			}
		}
		
		return resultado;
	}
			
	}
