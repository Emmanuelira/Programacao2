package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Enum.Carboidrato;
import Enum.Proteina;
import Enum.SaborBebida;
import Enum.Tamanho;

public class Cardapio {
	
	
	public List<String> getRefeicoes(){
		List<Proteina> proteinas = Arrays.asList(Proteina.values());
		List<Carboidrato> carboidratos = Arrays.asList(Carboidrato.values());
		List<String> refeicoes = new ArrayList<String>();
		
		for(int i = 0; i < proteinas.size(); i++) {
			for(int j = 0; j < carboidratos.size(); j++) {
				double preco = proteinas.get(i).getValor() + carboidratos.get(j).getValor();
				refeicoes.add(proteinas.get(i).getNome() + " com " + carboidratos.get(j).getNome()
						+ " - Preço: " + preco + "\n");
			}
		}
		return refeicoes;
	}
	
	public List<String> getBebidas() {
		List<SaborBebida> sabor = Arrays.asList(SaborBebida.values());
		List<Tamanho> tamanho = Arrays.asList(Tamanho.values());
		List<String> bebidas = new ArrayList<String>();
		
		for(int i = 0; i < sabor.size(); i++) {
			for(int j = 0; j < tamanho.size(); j++) {
				double preco = sabor.get(i).getValor() + tamanho.get(j).getValor();
				bebidas.add("Bebida: " + sabor.get(i).getNome() + " - Tamanho: " + tamanho.get(j).getNome()
						+ " - Preço: " + preco + "\n");
			}
		}
		return bebidas;
	}
	
	public List<String> getCardapio() {
		List<String> cardapio = new ArrayList<String>();
		
		for(int i = 0; i < getRefeicoes().size(); i++) {
			cardapio.add(getRefeicoes().get(i));
		}
		
		for(int i = 0; i < getBebidas().size(); i++) {
			cardapio.add(getBebidas().get(i));
		}
		return cardapio;
	}
	
}
