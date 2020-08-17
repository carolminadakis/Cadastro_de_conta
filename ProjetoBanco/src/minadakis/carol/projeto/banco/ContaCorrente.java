package minadakis.carol.projeto.banco;

public class ContaCorrente extends Conta {
	
	private Double limite = 500.0;

	@Override
	public Double sacar(Double valor) {
		if((saldo+limite) < valor){
			System.out.println("Você não tem limite");
			return 0.0;
		} else{
			return saldo = saldo + limite - valor;
		}
	}
	
}
