package questao2;

public class SistemaInterpol {
	
	String[] procurados;
	
	
	public void adicionarProcurados(String nomes) {
		
		procurados = nomes.split(" ");
	}
	
	public boolean ehProcurado(String nome) {
		
		for (int i = 0; i < procurados.length; i++) {
			if (nome.equals(procurados[i])) {
				return true;
			}
		}
		
		return false;
		
	}

}
