package minadakis.carol.projeto.banco;

public class ContaInvestimento extends Conta {
	
	Double tarifa = 0.03;
	Double valorDeposito = 0.0;

	public Double sacar(Double valorSaque) {
		saldo += valorDeposito;
		
		if(saldo > 0.0) {
			saldo = saldo - (valorSaque * tarifa);
		}
		return saldo = (saldo - valorSaque);
	}
}
