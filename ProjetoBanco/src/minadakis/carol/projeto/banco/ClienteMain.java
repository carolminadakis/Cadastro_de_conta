package minadakis.carol.projeto.banco;

import java.util.ArrayList;

public class ClienteMain {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		PessoaFisica cliente1 = new PessoaFisica();
		
		cliente1.setNomeCliente("Diemerson Fernando");
		cliente1.setRenda(3500.00);
		cliente1.setSenha("senha1");
		cliente1.setCpf(1234567);
		cliente1.setRg("4601257-9");
		cliente1.setUsuario("usuario.diemerson");
		
		PessoaFisica cliente2 = new PessoaFisica();
		
		cliente2.setNomeCliente("Roberto Marinho");
		cliente2.setCpf(1245789);
		cliente2.setRenda(900.00);
		cliente2.setRg("1871257-9");
		cliente2.setUsuario("usuario.marinho");
		cliente2.setSenha("senha2");
		
		PessoaJuridica cliente3 = new PessoaJuridica();
		
		cliente3.setNomeCliente("Carla Cristina");
		cliente3.setCnpj(1596846);
		cliente3.setRenda(1500.00);
		cliente3.setUsuario("usuario.carla");
		cliente3.setSenha("senha3");
		cliente3.setIe("687461");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		for (Cliente i : clientes) {
			System.out.println(i.getNomeCliente());
			System.out.println((i.getRenda() * 1.05));
			System.out.println();
		}
	}
}
