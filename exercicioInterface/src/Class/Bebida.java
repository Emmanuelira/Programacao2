package Class;

import Enum.SaborBebida;
import Enum.Tamanho;
import Interface.Item;

public class Bebida implements Item{
	
	private Tamanho tamanho;
	private SaborBebida sabor;
	
	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	@Override
	public double getPreco() {
		return sabor.getValor() + tamanho.getValor();
	}

	@Override
	public String getDescricao() {
		return "Bebida: " + sabor.getNome() + "\nTamanho: " + tamanho.getNome(); 
	}	
	
	public Tamanho getTamanho() {
		return tamanho;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}
	
}
