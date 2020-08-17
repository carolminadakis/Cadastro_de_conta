package minadakis.carol.projeto.banco;

public class PessoaJuridica extends Cliente {
	private int cnpj;
	private String ie;
	
	public PessoaJuridica(int cnpj, String ie) {
		this.cnpj = cnpj;
		this.ie = ie;
		super.setSenha(ie+cnpj);
	}

	@Override
	public void autenticacao(String usuario, String senha) {
		if(usuario == getNomeCliente() && senha == ie+cnpj) {
			System.out.println("Cliente Autenticado com sucesso!!");
		}else {
			System.out.println("Usuário e senha errado!");
		}
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}
	
	
}
