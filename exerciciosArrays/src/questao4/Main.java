package questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		
		System.out.println("Seja bem-vindo ao jogo da velha!");
		
		int linha;
		int coluna;
		
		do {
			jogo.imprimirTabuleiro();
			System.out.printf(
					"\nJogador %d, digite a linha e coluna: " , jogo.jogador());
			
			linha = teclado.nextInt();
			coluna = teclado.nextInt();
			
			if (jogo.validaJogada(linha,coluna)) {
				jogo.jogar(linha, coluna);
			} else {
				System.out.println("Jogada Inválida.");
				continue;
			}
			
		} while (jogo.detectaFimJogo() == false && jogo.deuVelha() == false);
		
		jogo.imprimirTabuleiro();
		System.out.println("\n");
		jogo.resultado();
		teclado.close();
	}
}
