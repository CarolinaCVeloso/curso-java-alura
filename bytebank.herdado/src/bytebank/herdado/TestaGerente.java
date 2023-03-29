package bytebank.herdado;

public class TestaGerente {

	public static void main(String[] args) {

		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("255.555.555-23");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
	
		g1.setSenha(222);
		boolean autentica = g1.autentica(222);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}

}
