package minadakis.carol.projeto.banco;

public class ContaPoupanca extends Conta {

	Double tarifa = 0.005;
	Double valorDeposito = 0.0;
	
	public Double sacar(Double valorSaque) {
		saldo += valorDeposito;
		
		if(saldo > 0.0) {
			saldo = saldo - (valorSaque * tarifa);
		}
		return saldo = (saldo - valorSaque);
	} 
}
