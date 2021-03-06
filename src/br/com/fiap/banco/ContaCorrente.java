package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	private String nomeInvestimento;
	

	public ContaCorrente(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
		
	}
			
	
	public void Investir (double valor , Produto produto) throws SaldoInsuficiente {
		boolean teste = false;
			teste = this.sacar(valor);
			if (teste == true) {
				this.saldoInvestimento += produto.investir(valor);
			
			}
	}
		
	public void Resgatar (double valor) throws SaldoInsuficiente{
		boolean teste = this.depositar(valor);
		if (teste == true) {
			saldoInvestimento -= valor;
			
			}
		else {
			throw new SaldoInsuficiente("Saldo Insufciente");
		}
		}
	
	
	@Override
	public void exibirSaldo() {
		System.out.println("Nome Cliente : " + this.cliente.getNome());
		System.out.println("Saldo Investimento : " + this.saldoInvestimento);
		System.out.println("Saldo: " + this.saldo);
		
	}
	
}
