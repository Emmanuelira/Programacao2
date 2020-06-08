package exercicioClassesAbstratas.questao2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestContaPoupanca {

	private ContaPoupanca p1;
	private ContaPoupanca p2;
	private ContaPoupanca p3;
	
	@Before
	public void setUp(){
		p1 = new ContaPoupanca("Luis", "a123b", 6165.68);
		p2 = new ContaPoupanca("Emmanuel", "cww456", 1849.65);
	}

	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException {
		p1.transferir("a123b", 100, p2);
		Assert.assertEquals(6060.68, p1.saldo, 0);
		Assert.assertEquals(1949.65, p2.saldo, 0);
		
		p2.transferir("cww456", 556.9, p1);
		Assert.assertEquals(1387.75, p2.saldo, 0);
		Assert.assertEquals(6617.58, p1.saldo, 0);
		
	}
	
	@Test (expected = SenhaInvalidaException.class)
	public void testTransferirSenhaExcp() throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException {
		p1.transferir("a1239b", 1001, p2);
		p2.transferir("cwew456", 256.98, p1);
		
	}
	
	@Test (expected = SaldoInsuficienteException.class)
	public void testTransferirSaldoExcp() throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException {
		p1.transferir("a123b", 6200, p2);
		p2.transferir("cww456", 4000, p1);
	}
	
	@Test (expected = ValorInvalidoException.class)
	public void testTransferirValorExcp() throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException {
		p1.transferir("a123b", 0, p2);
		p2.transferir("cww456", -98.74, p1);
	}
	
	@Test (expected = ContaInvalidaException.class)
	public void testTransferirContaExcp() throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException {
		p1.transferir("a123b", 45.6, p3);
	}

}
