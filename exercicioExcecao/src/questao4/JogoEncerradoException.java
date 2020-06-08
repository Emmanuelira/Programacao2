package questao4;

public class JogoEncerradoException extends Exception {
	
	public JogoEncerradoException () {
		super ("Não é permitido tentar mais palpites, o jogo está encerrado");
	}
	

}
