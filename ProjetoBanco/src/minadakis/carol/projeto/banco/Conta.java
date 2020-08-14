package minadakis.carol.projeto.banco;

public interface Conta {
	
	public void agencia(Integer numeroAgencia, Integer digitoAgencia);
	public void conta(Integer numeroConta, Integer digitoConta);
	public Double deposito(Double deposito);
	public Double sacar(Double valorSaque);
	public void dadosFuncionario(Funcionarios nomeFuncionario, Funcionarios cagFuncionarios);
	public void dadosCliente  (Cliente nomeCliente, Cliente docCliente);
 
}

