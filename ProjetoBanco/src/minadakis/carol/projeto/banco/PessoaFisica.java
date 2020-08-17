package minadakis.carol.projeto.banco;

public class PessoaFisica extends Cliente {

	private int cpf;
	private String rg;

	public PessoaFisica(int cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		super.setSenha(rg+cpf);
	}

	@Override
	public void autenticacao(String usuario, String senha) {
		if(usuario == getNomeCliente() && senha == rg+cpf) {
			System.out.println("Cliente Autenticado com sucesso!");
		}else {
			System.out.println("Usuário e senha errado!");
		}
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
