package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Class.Bebida;
import Class.Cliente;
import Class.Refeicao;
import Class.SistemaRestaurante;
import Enum.Carboidrato;
import Enum.Proteina;
import Enum.SaborBebida;
import Enum.Tamanho;
import Exception.ClienteInexistenteException;
import Exception.PagamentoInvalidoException;
import Exception.PedidoInexistenteException;

public class TestSistRest {
	
	private Cliente joao;
	private Cliente marcos;
	private Cliente lucas;
	private Cliente matheus;
	private Refeicao r1;
	private Refeicao r2;
	private Refeicao r3;
	private Refeicao r4;
	private Bebida b1;
	private SistemaRestaurante s;

	@Before
	public void setUp() throws ClienteInexistenteException {
		joao = new Cliente(4);
		marcos = new Cliente(5);
		lucas = new Cliente(4);
		matheus = new Cliente(1);
		r1 = new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO);
		r2 = new Refeicao(Proteina.MAMINHA, Carboidrato.ARROZ);
		r3 = new Refeicao(Proteina.FRANGO, Carboidrato.PURE);
		r4 = new Refeicao(Proteina.PORCO, Carboidrato.PAO);
		b1 = new Bebida(Tamanho.PEQUENO, SaborBebida.SPRITE);
		s = new SistemaRestaurante();
		
		s.adicionarCliente(joao);
		s.adicionarCliente(marcos);
		s.adicionarCliente(lucas);
		
		s.adicionarPedido(joao, r2);
		s.adicionarPedido(marcos, r3);
		s.adicionarPedido(lucas, r1);
		s.adicionarPedido(marcos, b1);
	}
	
	@Test
	public void testAdicionarCliente() {
		Assert.assertEquals(3, s.getClientes().size());
	}

	@Test
	public void testAdicionarPedido() {
		Assert.assertEquals(1, joao.getPedidos().size());
		Assert.assertEquals(2, marcos.getPedidos().size());
		Assert.assertEquals(1, lucas.getPedidos().size());
	}
	
	@Test (expected = ClienteInexistenteException.class)
	public void testAdicionarPedidoExcp() throws ClienteInexistenteException {
		s.adicionarPedido(matheus, r1);
	}

	@Test 
	public void testRemoverPedido() throws PedidoInexistenteException {
		s.removerPedido(marcos, b1);
	}
	
	@Test (expected = PedidoInexistenteException.class)
	public void testRemoverPedidoExcp() throws PedidoInexistenteException {
		s.removerPedido(marcos, r4);
	}

	@Test
	public void testComputarPagamentoCliente() {
		Assert.assertEquals(17.85, s.computarPagamentoCliente(joao),0.01);
		Assert.assertEquals(22, s.computarPagamentoCliente(marcos), 0.01);
		Assert.assertEquals(25.99, s.computarPagamentoCliente(lucas), 0.01);
	}

	@Test
	public void testReceberPagamentoCliente() throws PagamentoInvalidoException {
		s.receberPagamentoCliente(lucas, 25.99);
		s.receberPagamentoCliente(lucas, 40);
	}
	
	@Test (expected = PagamentoInvalidoException.class)
	public void testReceberPagamentoClienteExcp() throws PagamentoInvalidoException {
		s.receberPagamentoCliente(lucas, 10);
		s.receberPagamentoCliente(lucas, 0);
		s.receberPagamentoCliente(lucas, -54);
	}

	@Test
	public void testComputarPagamentoMesa() {
		Assert.assertEquals(43.84,s.computarPagamentoMesa(4),0.01);
		Assert.assertEquals(22,s.computarPagamentoMesa(5),0.01);
		Assert.assertEquals(0,s.computarPagamentoMesa(1),0.01);
	}

	@Test
	public void testReceberPagamentoMesa() throws PagamentoInvalidoException {
		s.receberPagamentoMesa(4, 43.84);
		s.receberPagamentoMesa(4, 50);
	}
	
	@Test (expected = PagamentoInvalidoException.class)
	public void testReceberPagamentoMesaExcp() throws PagamentoInvalidoException {
		s.receberPagamentoMesa(4, 10);
		s.receberPagamentoMesa(4, 0);
		s.receberPagamentoMesa(4, -54);
	}

}
