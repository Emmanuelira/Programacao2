package Class;

import java.util.ArrayList;
import java.util.List;
import Interface.Item;

public class Cliente {

	private int mesa;
	private List<Item> pedidos;
	
	public Cliente(int mesa) {
		this.mesa = mesa;
		pedidos = new ArrayList<Item>();
	}

	public int getMesa() {
		return mesa;
	}
	
	public double getConta() {
		double conta;
		
		if(pedidos.size() == 0) {
			conta = 0;
		} else {
			conta = 0;
			for(int i = 0; i < pedidos.size(); i++) {
				conta += pedidos.get(i).getPreco();
			}
		}
		return conta;
	}
	
	public void adicionarPedido(Item item) {
		pedidos.add(item);
	}
	
	public void removerPedido(Item item) {
		pedidos.remove(item);
	}
	
	public List<Item> getPedidos() {
		return pedidos;
	}
	
	public List<String> getPedidosNome() {
		List<String> ped = new ArrayList<String>();
		
		for(int i = 0; i < pedidos.size(); i++) {
			ped.add(pedidos.get(i).getDescricao() + "\n");
		}	
		return ped;
	}

}
