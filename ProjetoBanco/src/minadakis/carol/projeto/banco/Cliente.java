package minadakis.carol.projeto.banco;

public abstract class Cliente implements Autenticador{
	
	private String nomeCliente;
	private String usuario;
	private String senha;
	private Double renda;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getDocCliente() {
		return senha;
	}
	
	public void setDocCliente(String docCliente) {
		this.senha = docCliente;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
