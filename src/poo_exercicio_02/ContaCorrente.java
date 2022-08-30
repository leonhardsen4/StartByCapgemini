package poo_exercicio_02;

public class ContaCorrente {
	
	private String conta = null;
	private String cliente = null;
	private float saldo = 0;
	
	public ContaCorrente(String conta, String cliente, float saldo) {
		this.setConta(conta);
		this.setCliente(cliente);
		this.setSaldo(saldo);
	}
	
	public void alterarNome(String nome) {
		this.setCliente(nome);
	}
	
	public float deposito(float valorDeposito) {
		saldo = saldo + valorDeposito;
		return saldo;
	}
	
	public float saque(float valorSaque) {
		if ((saldo - valorSaque) < 0) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo = saldo - valorSaque;
		}
		return saldo;
	}
	
	public void imprimirDados() {
		System.out.println("\nDados atualizados do Cliente:");
		System.out.println("Nome: " + this.getCliente());
		System.out.println("Conta: " + this.getConta());
		System.out.printf("Saldo: %.2f\n", this.getSaldo());
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
