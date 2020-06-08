package questao3;
import java.util.*;

public class LojaDeCarros {
	
	List<Carro> carrosDisponiveis;
	List<Carro> carrosVendidos;

	public LojaDeCarros() {
		carrosDisponiveis = new ArrayList<Carro>();
		carrosVendidos = new ArrayList<Carro>();
	}
	
	public void adicionarCarro (Carro carro) {
		carrosDisponiveis.add(carro);
	}
	
	public void exibirCarrosDisponiveis () {
		System.out.println(carrosDisponiveis);
	}
	
	public void venderCarro (int id) {
		for (int i = 0; i < carrosDisponiveis.size(); i++) {
			if (carrosDisponiveis.get(i).id == id) {
				carrosVendidos.add(carrosDisponiveis.get(i));
				carrosDisponiveis.remove(i);
			}
		}
	}
	
	public void adicionarPromocao(int id) {
		for (int i = 0; i < carrosDisponiveis.size(); i++) {
			if (carrosDisponiveis.get(i).id == id) {
				carrosDisponiveis.get(i).promocao = true;
				break;
			}
		}
	}
	
	public double computaApuradoDasVendas () {
		double apurado = 0.0;
		for (int i = 0; i < carrosVendidos.size(); i++) {
			apurado += carrosVendidos.get(i).calculaPreco();
		}
		return apurado;
	}
	
	public void limparVendidos() {
		carrosVendidos.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
