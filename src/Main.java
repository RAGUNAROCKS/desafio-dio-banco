
public class Main {

	public static void main(String[] args) {
		Conta CC = new ContaCorrente();
		Conta CP = new ContaPoupanca();
		
		CC.imprimirExtrato();
		CP.imprimirExtrato();
	}

}
