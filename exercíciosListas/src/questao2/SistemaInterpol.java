package questao2;
import java.util.*;

public class SistemaInterpol {
	
	List<String> procurados = new ArrayList<String>();
	
	public void adicionarProcurado (String nome) {
		procurados.add(nome);
	}
	
	public boolean ehProcurado (String nome) {
		if (procurados.contains(nome)) {
			return true;
		} else {
			return false;
		}
	}

}
