package questao1;

public class StringUtils {
	
	public static String formataAtributo (String atributo) {
		
		atributo = removeEspacosSuperfluos(atributo);
		int contador = 0;
		String resultado = "";
		for (String i : atributo.split(" ")) {
			if (contador < 1) {
				resultado += i.toLowerCase();
			} else {
				resultado += i.substring(0,1).toUpperCase();
				resultado += i.substring(1, i.length()).toLowerCase();
			}
			
			contador++;
		}
		
		return resultado;
	}
	
	public static String formataMetodo (String metodo) {
		
		metodo = removeEspacosSuperfluos(metodo);
		int contador = 0;
		String resultado = "";
		for (String i : metodo.split(" ")) {
			if (contador < 1) {
				resultado += i.toLowerCase();
			} else {
				resultado += i.substring(0,1).toUpperCase();
				resultado += i.substring(1, i.length()).toLowerCase();
			}
			
			contador++;
		}
		
		return resultado;
		
	}
	
	public static String formataClasse (String classe ) {
		
		classe = removeEspacosSuperfluos(classe);
		String resultado = "";
		for (String i : classe.split(" ")) {
			resultado += i.substring(0,1).toUpperCase();
			resultado += i.substring(1, i.length()).toLowerCase();
		}
		return resultado;
	}
	
	public static String ordenaStrings (String palavra1, String palavra2) {
		
		String resultado = "";
		int contador = 0;
		String parametro = "";
		String sobra = "";
		
		if (palavra1.length() > palavra2.length()) {
			parametro = palavra2;
			sobra = palavra1;
		} else {
			parametro = palavra1;
			sobra = palavra2;
		}
		
		while(contador < parametro.length()) {
			if (palavra1.charAt(contador) < palavra2.charAt(contador)) {
				resultado += palavra1 + " " + palavra2;
				break;
			} else if (palavra1.charAt(contador) > palavra2.charAt(contador)) {
				resultado += palavra2 + " " + palavra1;
				break;	
			}
		
			contador++;
		}
		
		if (resultado == "") {
			resultado = parametro + " " + sobra;
		}

		return resultado;
	}

	public static boolean ehPalindromo (String palavra) {
		
		String palindromo = "";
		int i = palavra.length();
		
		while (i > 0) {
			palindromo += palavra.substring(i-1,i);
			i--;
		}
		
		if (palavra.equals(palindromo)) {
			return true;
		} else { 
			return false;
		}

	}
	
	public static String transformaParaCaixaAlta(String palavra) {
		return palavra.toUpperCase();
	}
	
	public static int contaVogais (String frase) {
		
		int resultado = 0;
		int contador = 0;
		frase = frase.toLowerCase();
		while (contador < frase.length()) {	
			switch(frase.charAt(contador)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				resultado++;
				break;
			}
			contador++;		
		}
		return resultado;
	}
	
	public static String removeEspacosSuperfluos (String frase) {
		
		frase = frase.trim();
		int contador = 0;
		int acumulador = 0;
		
		while (contador < frase.length()) {
		
			if (frase.charAt(contador) == ' ') {
				acumulador++;
			} else {
				acumulador = 0;
			}
			
			if (acumulador > 1) {
				String fraseTemp = frase;
				frase = frase.substring(0,contador);
				frase += fraseTemp.substring(contador+1);
				acumulador--;
				contador--;
				}
			contador++;
		}
		return frase;
	}

	public static int[] ocorrencias (String frase, String subPalavra) {
		        
		int[] arrayTemp = new int[frase.length()];
		int contador = 0;
		int referencia = 0;
		
		while (frase.indexOf("doce", referencia) != -1) {
			arrayTemp[contador] = frase.indexOf("doce", referencia);
			referencia = frase.indexOf("doce", referencia) + 1;
			contador++;
		}
		
		int[] resultado = new int[contador];
		contador = 0;
		
		while (contador < resultado.length) {
			resultado[contador] = arrayTemp[contador];
			contador++;
		}
		
		return resultado;
	}
	
	public static int binarioPraDecimal (String binario) {
		
		int contador = binario.length();
		int resultado = 0;
		int potencia = 0;
		while (contador > 0) {
			if (binario.charAt(contador-1) == '1') {
				resultado += 1 * Math.pow(2, potencia);
			}
			contador--;
			potencia++;
		}
		return resultado;		
	}
	
	public static int getQtdadePalavras (String frase) {
		
		frase = removeEspacosSuperfluos(frase);
		String[] palavras = frase.split(" ");
		int resultado = palavras.length;
		return resultado;
		
	}
	
	public static int[] histogramaLetras(String texto) {
		
		int contador = 0;
		String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j",
				"k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		texto = texto.toLowerCase();		
		int[] histograma = new int[alfabeto.length];
		
		
		while (contador < alfabeto.length) {
			int referencia = 0;
			int quant = 0;
			
			while (texto.indexOf(alfabeto[contador], referencia) != -1) {
				referencia = texto.indexOf(alfabeto[contador], referencia) +1;
				quant++;
			}
			
			histograma[contador] = quant;			
			contador++;
		}
		
		return histograma;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
