package minadakis.carol.projeto.banco;

public abstract class Cliente implements Autenticador{
	
	private String nomeCliente;
	private String docCliente;

	
	
	public Cliente(String nomeCliente, String docCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.docCliente = docCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getDocCliente() {
		return docCliente;
	}
	public void setDocCliente(String docCliente) {
		this.docCliente = docCliente;
	}

}
