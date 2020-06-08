package Main;

import Class.Bebida;
import Class.Cardapio;
import Class.Cliente;
import Class.Refeicao;
import Class.SistemaRestaurante;
import Enum.Carboidrato;
import Enum.Proteina;
import Enum.SaborBebida;
import Enum.Tamanho;
import Exception.ClienteInexistenteException;
import Exception.PedidoInexistenteException;


public class Main {

	public static void main(String[] args) throws ClienteInexistenteException, PedidoInexistenteException {
		
		Refeicao r1 = new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO);
		Refeicao r2 = new Refeicao(Proteina.MAMINHA, Carboidrato.ARROZ);
		Refeicao r3 = new Refeicao(Proteina.FRANGO, Carboidrato.PURE);
		Refeicao r4 = new Refeicao(Proteina.LINGUICA, Carboidrato.BATATA);
		Refeicao r5 = new Refeicao(Proteina.ALCATRA, Carboidrato.PAO);
		Refeicao r6 = new Refeicao(Proteina.PORCO, Carboidrato.TAPIOCA);
		
//		System.out.println(r1.getDescricao());
//		System.out.println(r2.getPreco());
//		System.out.println(r3.getCarboidrato());
//		System.out.println(r4.getProteina());
//		System.out.println(r5.getPreco());
//		System.out.println(r6.getDescricao());
//		
		Bebida b1 = new Bebida(Tamanho.PEQUENO, SaborBebida.SPRITE);
//		
//		System.out.println(b1.getDescricao());
		
		Cardapio c = new Cardapio();
//		System.out.println(c.getBebidas());
//		System.out.println(c.getRefeicoes());
//		System.out.println(c.getCardapio());
		
		Cliente joao = new Cliente(4);
		joao.adicionarPedido(r1);
		joao.adicionarPedido(r3);
		joao.adicionarPedido(r2);
		
//		System.out.println(joao.getConta());
//		System.out.println(joao.getMesa());
//		System.out.println(joao.getPedidos());
		
		joao.removerPedido(r3);
		
//		System.out.println(joao.getConta());
		
		System.out.println(joao.getPedidos());
		Cliente marcos = new Cliente(5);
		SistemaRestaurante s = new SistemaRestaurante();
		s.adicionarCliente(joao);
//		s.adicionarPedido(marcos, r2); //CLIENTE INEXISTENTE

		s.removerPedido(joao, r1);
		
		System.out.println(joao.getPedidos());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
