package exercicioClassesAbstratas.questao1;

public class Main {

	public static void main(String[] args) {
			
		Quadrado q = new Quadrado(Cor.AMARELO, 10);
		System.out.println(q.getLado1());
		System.out.println(q.calculaArea());
		System.out.println(q.calculaPerimetro());

		Retangulo r = new Retangulo(Cor.BRANCO, 10, 20);
		System.out.println(r.getLado1());
		System.out.println(r.getLado2());
		System.out.println(r.calculaArea());
		System.out.println(r.calculaPerimetro());
	
		Trapezio t = new Trapezio(Cor.CINZA, 10, 30, 15, 15, 8);
		System.out.println(t.getLado1());
		System.out.println(t.getLado2());
		System.out.println(t.getLado3());
		System.out.println(t.getLado4());
		System.out.println(t.calculaArea());
		System.out.println(t.calculaPerimetro());
		
		Circulo c = new Circulo(Cor.AZUL, 20);
		System.out.println(c.getCor());
		System.out.println(c.calculaArea());
		System.out.println(c.calculaPerimetro());
	
	
	
	
	
	
	
	
	
	
	
	}

}
