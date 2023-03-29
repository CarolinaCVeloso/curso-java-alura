package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
	
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		boolean sucessoTransferência = contaMarcela.transfere(3000, contaPaulo);
		
		if(sucessoTransferência) {
			System.out.println("transferência com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo Silveira";
		System.out.println(contaPaulo.titular);
	}
	
}

