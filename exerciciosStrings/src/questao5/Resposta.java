package questao5;

public class Resposta {

	public static void main(String[] args) {
		
		/*StringBuilder, diferentemente do String, � mut�vel. 
		Ent�o, somente um objeto � criado, evitando o desperd�cio de mem�ria por mais
		que o GC venha posteriormente remov�-lo.
		*/
		
		StringBuilder nome = new StringBuilder("Eduardo");
		nome.append(" de Lucena");
		nome.append(" Falcao");
		
		System.out.println(nome);

	}

}
