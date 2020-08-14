package minadakis.carol.projeto.banco;

public abstract class Funcionarios implements Autenticador{
	
	private String nomeFuncionario;
	private String cargo;
	
	
	public Funcionarios(String nomeFuncionario, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
