package minadakis.carol.projeto.banco;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente("Ana Carolina", "Gerente");
		Atendente atendente1 = new Atendente("Mariana", "Atendente");
		Caixa caixa1 = new Caixa("Janaína", "Caixa");
		Seguranca seguranca1 = new Seguranca("José", "Segurança");
		
		System.out.println();
		PessoaFisica pessoaFisica1 = new PessoaFisica("Maria Aparecida", "123.456.789-10");
		PessoaFisica pessoaFisica2 = new PessoaFisica("Leandro", "941-023-333.00");
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Conexão Ltda", "78.823.834/0001-94");
		
		pessoaFisica1.autenticacao("usuario_mariaapaercida", "senha_123");
		pessoaFisica2.autenticacao("usuario_leandro", "senha_456");
		pessoaJuridica1.autenticacao("usuario_conexaoltda", "senha_789");
		
		ContaCorrente contaCorrente1 = new ContaCorrente();
		contaCorrente1.dadosFuncionario(gerente1, gerente1);
		contaCorrente1.dadosCliente(pessoaJuridica1,pessoaJuridica1);
		System.out.println();
		contaCorrente1.agencia(141, 58);
		contaCorrente1.conta(1641351, 8);
		contaCorrente1.setSaldo(385.00);
		contaCorrente1.deposito(900.0);
		contaCorrente1.sacar(375.00);
		System.out.println("\n________________________________________________");
		System.out.println();
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		contaPoupanca1.dadosFuncionario(caixa1, caixa1);
		contaPoupanca1.dadosCliente(pessoaFisica1, pessoaFisica1);
		System.out.println();
		contaPoupanca1.agencia(654, 12);
		contaPoupanca1.conta(2654845, 7);
		contaPoupanca1.setSaldo(150.0);
		contaPoupanca1.deposito(800.0);
		contaPoupanca1.sacar(150.00);
		System.out.println("\n________________________________________________");
		System.out.println();
		
		ContaInvestimento contaInvestimento1 = new ContaInvestimento();
		contaInvestimento1.dadosFuncionario(atendente1, atendente1);
		contaInvestimento1.dadosCliente(pessoaFisica2, pessoaFisica2);
		contaInvestimento1.agencia(6546, 88);
		contaInvestimento1.conta(5136483, 01);
		System.out.println();
		contaInvestimento1.setSaldo(1000.0);
		contaInvestimento1.deposito(250.00);
		contaInvestimento1.sacar(250.00);
		System.out.println();
	}

}
