package bytebank.composto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta ContaMarcela = new Conta();
		System.out.println(ContaMarcela.getSaldo());
	
		ContaMarcela.titular = new Cliente();
		System.out.println(ContaMarcela.titular);

		ContaMarcela.titular.nome = "Marcela";
		System.out.println(ContaMarcela.titular.nome);
	
	
	}
}
