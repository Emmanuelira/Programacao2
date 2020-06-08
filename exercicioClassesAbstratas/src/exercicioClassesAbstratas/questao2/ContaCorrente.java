package exercicioClassesAbstratas.questao2;

public class ContaCorrente extends ContaBancaria{
	
	private double custoTransferencia;

	public ContaCorrente(String nome, String senha, double saldo) {
			super(nome, senha, saldo);
		}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, SenhaInvalidaException,
	ValorInvalidoException, ContaInvalidaException{
			
		if(conta instanceof ContaBancaria) {
			if(valor > 0) {
				if(this.senha.equals(senha)) {
					if(valor < 5000) {
						custoTransferencia = 0.0025 * valor;
					} else {
						custoTransferencia = 15;
					}
					if(valor <= this.saldo + custoTransferencia ) {
						this.saldo -= valor + custoTransferencia;
						System.out.println(this.saldo);
						conta.saldo += valor;
						System.out.println(conta.saldo);
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
