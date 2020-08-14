package minadakis.carol.projeto.banco;

public class ContaPoupanca implements Conta {
	final static Double TARIFA = 0.005;
	
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
		Imprimir.imprimir("\nNome do cliente, conta poupança: " + nomeCliente.getNomeCliente());
		Imprimir.imprimir("\nCPF: " + docCliente.getDocCliente());	
	}

	@Override
	public void agencia(Integer numeroAgencia, Integer digitoAgencia) {
		Imprimir.imprimir("\nAgencia: " + numeroAgencia);
		Imprimir.imprimir("\nDigito: " + digitoAgencia);
	}

	@Override
	public void conta(Integer numeroConta, Integer digitoConta) {
		Imprimir.imprimir("\nConta Poupança: " + numeroConta);
		Imprimir.imprimir("\nDigito: " + digitoConta);
	}

	@Override
	public Double deposito(Double deposito) {
		Imprimir.imprimir("\nSaldo inicial R$ " + getSaldo());
		Imprimir.imprimir("\nDepósito efetuado no valor de R$ " + deposito);
		return valorDeposito += deposito;
	}
	
	@Override
	public Double sacar(Double valorSaque) {
		Double saldoTarifa = 0.0;
		saldo += valorDeposito;
		
		Imprimir.imprimir("\nSaldo com depósito R$ " + saldo);
		
		if(saldo > 0.0) {
			saldoTarifa = saldo - (valorSaque * TARIFA);
		novoSaldo = (saldoTarifa - valorSaque);
		
		Imprimir.imprimir("\nSeu saldo atual é de R$ " + novoSaldo);
		}
		return novoSaldo;
	
	} 
}
