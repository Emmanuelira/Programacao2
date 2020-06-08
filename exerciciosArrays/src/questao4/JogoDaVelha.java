package questao4;

import java.util.Arrays;

public class JogoDaVelha {
	
	char[][] tabuleiro;
	boolean vezJogador1;
	
	public JogoDaVelha() {
		tabuleiro = new char[3][3];
		vezJogador1 = true;
	}
	
	public boolean validaJogada(int linha, int coluna) {
		
		int[] referencia = {0, 1, 2};
		boolean validaLinha = false;
		boolean validaColuna = false;
		
		for (int i = 0; i < referencia.length; i++) { 
			
			if (linha == referencia[i]) {
				validaLinha = true;
			}	
			
			if (coluna == referencia[i]) {
				validaColuna = true;
			}
		}
		
		if (validaLinha == true && validaColuna == true &&
				tabuleiro[linha][coluna] == '\u0000') {
			return true;
		} else {
			return false;
		}
	}

	public void jogar (int linha, int coluna) {
		
		if (vezJogador1 == true) {
			tabuleiro[linha][coluna] = 'x';
		} else {
			tabuleiro[linha][coluna] = 'o';
		}
			
		vezJogador1 = !vezJogador1;
		
	}
	
	public void imprimirTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i ++) {
			System.out.println(Arrays.toString(tabuleiro[i]));
		}
	}
	
	public int jogador () {
		if (vezJogador1 == true) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public boolean detectaFimJogo() {
		
		char[] fimX = {'x', 'x', 'x'}; 
		char[] fimO = {'o', 'o', 'o'};
		
		for(int linha = 0; linha < tabuleiro.length; linha++) {
			if (Arrays.equals(tabuleiro[linha], fimX) || 
					Arrays.equals(tabuleiro[linha], fimO)){
				return true;
			}		
		}
		
		for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
			
			if ((tabuleiro[0][coluna] == 'x' &&
					tabuleiro[1][coluna] == 'x' &&
					tabuleiro[2][coluna] == 'x') ||
					
					(tabuleiro[0][coluna] == 'o' &&
					tabuleiro[1][coluna] == 'o' &&
					tabuleiro[2][coluna] == 'o')) {
				return true;
			}
		}
		
		char[] d1 = {tabuleiro[0][0], tabuleiro[1][1], tabuleiro[2][2]};
		char[] d2 = {tabuleiro[2][0], tabuleiro[1][1], tabuleiro[0][2]};
		
		if (Arrays.equals(d1, fimX) || Arrays.equals(d1, fimO) ||
				Arrays.equals(d2, fimX) || Arrays.equals(d2, fimO)) {
			return true;
		}
		
		return false;
	}
	
	public boolean deuVelha() {
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				if (tabuleiro[linha][coluna] == '\u0000') {
					return false;
				}
			}
		}
		return true;
	}

	public void resultado() {
		vezJogador1 = !vezJogador1;
		if (detectaFimJogo() == true) {
			System.out.printf("Vitória do Jogador %s!", jogador());
		} else {
			System.out.println("Deu velha!");
		}
	}
	
}
