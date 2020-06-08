package exercicioClassesAbstratas.questao2;

public class ContaPoupanca extends ContaBancaria{

	private static int custoTransferencia = 5;
	
	public ContaPoupanca(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) 
			throws SaldoInsuficienteException, SenhaInvalidaException,
			ValorInvalidoException, ContaInvalidaException{
		if(conta instanceof ContaBancaria) {
			if(valor > 0) {
				if(this.senha.equals(senha)) {
					if(valor <= this.saldo + custoTransferencia ) {
						this.saldo -= valor + custoTransferencia;
						conta.saldo += valor;				
					} else {
						throw new SaldoInsuficienteException();
					}
				} else {
					throw new SenhaInvalidaException();
				}
			} else {
				throw new ValorInvalidoException();
			}
		} else {
			throw new ContaInvalidaException();
		}	
	}
}
