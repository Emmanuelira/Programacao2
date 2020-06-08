package Class;

import Enum.Carboidrato;
import Enum.Proteina;
import Interface.Item;

public class Refeicao implements Item{
	
	private Proteina p;
	private Carboidrato c;
	
	public Refeicao(Proteina p, Carboidrato c) {
		this.p = p;
		this.c = c;
	}
	
	@Override
	public double getPreco() {
		return p.getValor() + c.getValor();
	}
	
	@Override
	public String getDescricao() {
		return "Refeição: " + p.getNome() + " com " + c.getNome();
	}
	
	public Proteina getProteina() {
		return p;
	}
		
	public Carboidrato getCarboidrato() {
		return c;
	}
	
}
