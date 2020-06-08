package exercicioClassesAbstratas.questao2;

public abstract class ContaBancaria {

	protected String nome;
	protected String senha;
	protected double saldo;
	
	public ContaBancaria(String nome, String senha, double saldo) {
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String senha, String nome) {
		if(this.senha.equals(senha)) {
			this.nome = nome;
		} else {
			System.out.println("Senha incorreta");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSenha(String senhaAtual, String senhaNova) {
		if(this.senha.equals(senhaAtual)) {
			this.senha = senhaNova;
		} else {
			System.out.println("Senha incorreta");
		}
	}
	
	public abstract void transferir(String senha, double valor,
			ContaBancaria conta) throws SaldoInsuficienteException,
	SenhaInvalidaException, ValorInvalidoException, ContaInvalidaException;
	
}
