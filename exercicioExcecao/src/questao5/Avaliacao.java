package questao5;

public class Avaliacao {
	private double nota1;
	private double nota2;

	public void setNota1(double nota1) throws NotaInvalidaException{
		if (nota1 < 0 || nota1 > 10) {
			throw new NotaInvalidaException();
		}
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) throws NotaInvalidaException{
		if (nota2 < 0 || nota2 > 10) {
			throw new NotaInvalidaException();
		}
		this.nota2 = nota2;
	}

	public double getMedia() {
		return (nota1 + nota2) / 2;
	}
}
