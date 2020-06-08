package questao5;

public class Resposta {

	public static void main(String[] args) {
		
		/*StringBuilder, diferentemente do String, é mutável. 
		Então, somente um objeto é criado, evitando o desperdício de memória por mais
		que o GC venha posteriormente removê-lo.
		*/
		
		StringBuilder nome = new StringBuilder("Eduardo");
		nome.append(" de Lucena");
		nome.append(" Falcao");
		
		System.out.println(nome);

	}

}
