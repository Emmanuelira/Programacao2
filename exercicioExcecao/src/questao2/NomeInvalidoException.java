package questao2;

public class NomeInvalidoException extends Exception{
	
	public NomeInvalidoException() {
		super("O nome fornecido não pode ser nulo ou vazio");
	}

}
