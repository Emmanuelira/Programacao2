package questao2;

public class Main {

	public static void main(String[] args) {
		
		SistemaInterpol sist = new SistemaInterpol();
		sist.adicionarProcurado("Joaquim");
		sist.adicionarProcurado("Maria");
		sist.adicionarProcurado("Emmanuel");
		
		System.out.println(sist.procurados);
		
		System.out.println(sist.ehProcurado("Lucas"));
		System.out.println(sist.ehProcurado("Emmanuel"));
		

	}

}
