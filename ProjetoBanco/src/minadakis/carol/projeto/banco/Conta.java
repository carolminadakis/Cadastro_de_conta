package minadakis.carol.projeto.banco;

public abstract class Conta {

	private Agencia agencia;
	private int numero;
	private int digito;
	private Funcionarios funciarioAbriuConta;
	private Cliente cliente;
	protected Double saldo = 0.0;

	public Double depositar(Double valor){
		return saldo += valor;
	}

	public Double sacar(Double valor){
		return saldo -= valor;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public Funcionarios getFunciarioAbriuConta() {
		return funciarioAbriuConta;
	}

	public void setFunciarioAbriuConta(Funcionarios funciarioAbriuConta) {
		this.funciarioAbriuConta = funciarioAbriuConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}
}

