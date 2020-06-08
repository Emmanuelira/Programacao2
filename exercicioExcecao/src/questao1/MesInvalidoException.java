package questao1;

public class MesInvalidoException extends Exception{
	
	public MesInvalidoException() {
		super("O número do mês deve estar contido no intervalo [1, 12]");
	}

}