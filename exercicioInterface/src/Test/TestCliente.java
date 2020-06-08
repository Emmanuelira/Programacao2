package Test;

import org.junit.Assert;
import org.junit.Before;
import Class.Cliente;
import Class.Refeicao;
import Enum.Carboidrato;
import Enum.Proteina;

public class TestCliente {

	private Cliente joao;
	private Refeicao r1;
	private Refeicao r2;
	
	@Before
	public void setUp() {
		joao = new Cliente(5);
		r1 = new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO);
		r2 = new Refeicao(Proteina.MAMINHA, Carboidrato.ARROZ);
		joao.adicionarPedido(r1);
		joao.adicionarPedido(r2);
	}

	@org.junit.Test
	public void testGetConta() {
		Assert.assertEquals(43.84, joao.getConta(), .01);
		joao.removerPedido(r1);
		joao.removerPedido(r2);
		Assert.assertEquals(0, joao.getConta(), .01);
		
	}

	@org.junit.Test
	public void testAdicionarPedido() {
		Assert.assertEquals(2, joao.getPedidos().size());
		joao.removerPedido(r1);
		joao.removerPedido(r2);
		Assert.assertEquals(0, joao.getPedidos().size());
		
	}

	@org.junit.Test
	public void testRemoverPedido() {
		joao.removerPedido(r1);
		Assert.assertEquals(1, joao.getPedidos().size());
		joao.removerPedido(r2);
		Assert.assertEquals(0, joao.getPedidos().size());
	}


}
