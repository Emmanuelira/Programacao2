package exercicioPolimorfismo.questao1;

public class Preguica extends Animal{
	
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	public void escalarArvore() {
		System.out.println("Não");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZZzzzzZZZZzzzz");
	}
}
