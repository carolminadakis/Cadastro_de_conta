package minadakis.carol.projeto.banco;

public class ContaCorrente implements Conta {
	
	final static Double LIMITE = 500.0;
	
	Double saldo = 0.0;
	Double valorDeposito = 0.0;
	Double novoSaldo = 0.0;
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public void dadosFuncionario(Funcionarios nomeFuncionario, Funcionarios cargoFuncionario) {
		Imprimir.imprimir("\nFuncionário que abriu a conta: " + nomeFuncionario.getNomeFuncionario());
		Imprimir.imprimir("\nCargo: " + cargoFuncionario.getCargo());
	}
	@Override
	public void dadosCliente(Cliente nomeCliente, Cliente docCliente) {
		Imprimir.imprimir("\nNome do cliente correntista: " + nomeCliente.getNomeCliente());
		Imprimir.imprimir("\nCNPJ: " + docCliente.getDocCliente());
	}
	
	
	@Override
	public void agencia(Integer numeroAgencia, Integer digitoAgencia) {
		Imprimir.imprimir("\nAgencia: " + numeroAgencia);
		Imprimir.imprimir("\nDigito: " + digitoAgencia);
	}

	@Override
	public void conta(Integer numeroConta, Integer digitoConta) {
		Imprimir.imprimir("\nConta Corrente: " + numeroConta);
		Imprimir.imprimir("\nDigito: " + digitoConta);
	}

	@Override
	public Double deposito (Double deposito) {
	
		Imprimir.imprimir("\nSaldo inicial R$ " + getSaldo());
		Imprimir.imprimir("\nDepósito efetuado no valor de R$ " + deposito);
		return valorDeposito += deposito;	
	}
	
	@Override
	public Double sacar(Double valorSaque) {
		Double saldoLimite = 0.0;
		saldo += valorDeposito;
		
		Imprimir.imprimir("\nSaldo após depósito R$ " + saldo);
		Imprimir.imprimir("\nLimite disponível R$ " + LIMITE);
		
		saldoLimite = LIMITE + saldo;
		Imprimir.imprimir("\nSaldo com limite: R$ " + saldoLimite);
		
		if(saldo > 0.0 || valorSaque <= saldoLimite) {
			novoSaldo = (saldo - valorSaque);
			
			Imprimir.imprimir("\nSaque no valor de R$ " + valorSaque);
			Imprimir.imprimir("\nSeu saldo atualizado com limite é de R$ " + novoSaldo);
		} else {
			Imprimir.imprimir("\nSaldo insuficiente na conta.");
		}
		return novoSaldo;
	}





}
