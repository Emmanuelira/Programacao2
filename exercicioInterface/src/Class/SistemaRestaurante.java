package Class;

import java.util.ArrayList;
import java.util.List;
import Exception.ClienteInexistenteException;
import Exception.PagamentoInvalidoException;
import Exception.PedidoInexistenteException;
import Interface.Item;

public class SistemaRestaurante {
	
	private List<Cliente> clientes;
	
	public SistemaRestaurante() {
		clientes = new ArrayList<Cliente>();
	}
	
	public List<Cliente> getClientes(){
		return clientes;
	}
	
	public void adicionarCliente(Cliente c) {
		if(!clientes.contains(c)) {
			clientes.add(c);
		}
	}
	
	public void adicionarPedido(Cliente c, Item i) throws ClienteInexistenteException{
		if(!clientes.contains(c)) {
			throw new ClienteInexistenteException();
		} else {
			c.adicionarPedido(i);
		}
	}
	
	public void removerPedido(Cliente c, Item i) throws PedidoInexistenteException {
		if(!c.getPedidos().contains(i)) {
			throw new PedidoInexistenteException();
		} else {
			c.getPedidos().remove(i);
		}
	}
	
	public double computarPagamentoCliente(Cliente c) {
		return c.getConta();
	}
	
	public void receberPagamentoCliente(Cliente c, double pagamento) throws PagamentoInvalidoException{
		double troco;
		if(pagamento < computarPagamentoCliente(c)) {
			throw new PagamentoInvalidoException();
		} else if(pagamento > computarPagamentoCliente(c)) {
			troco = pagamento - computarPagamentoCliente(c); //PARA CASO DE USO DE CLASSES DE CONTAS.
		}
	}
	
	public double computarPagamentoMesa(int mesa) {
		List<Cliente> cls = new ArrayList<Cliente>();
		double totalMesa;
		
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getMesa() == mesa) {
				cls.add(clientes.get(i));
			}
		}
		
		if(cls.size() == 0) {
			totalMesa = 0;
		} else {
			totalMesa = 0;
			for(int i = 0; i < cls.size(); i++) {
				totalMesa += cls.get(i).getConta();
			}
		}
		return totalMesa;
	}
	
	public void receberPagamentoMesa(int mesa, double pagamento) throws PagamentoInvalidoException{
		double troco;
		if(pagamento < computarPagamentoMesa(mesa)) {
			throw new PagamentoInvalidoException();
		} else if(pagamento > computarPagamentoMesa(mesa)) {
			troco = pagamento - computarPagamentoMesa(mesa); //PARA CASO DE USO DE CLASSES DE CONTAS.
		}
	}	

}
