package minadakis.carol.projeto.banco;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente("Ana Carolina", "Gerente");
		Atendente atendente1 = new Atendente("Mariana", "Atendente");
		Caixa caixa1 = new Caixa("Janaina", "Caixa");
		Seguranca seguranca1 = new Seguranca("Jose", "Segurança");
		
		ContaCorrente contaCorrente1 = new ContaCorrente();
		System.out.println();
		contaCorrente1.sacar(375.00);
		System.out.println("\n________________________________________________");
		System.out.println();
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		System.out.println();
		contaPoupanca1.depositar(800.0);
		contaPoupanca1.sacar(150.00);
		System.out.println("\n________________________________________________");
		System.out.println();
		
		ContaInvestimento contaInvestimento1 = new ContaInvestimento();
		System.out.println();
		contaInvestimento1.depositar(550.00);
		contaInvestimento1.sacar(250.00);
		System.out.println();
		
		
	}

}
