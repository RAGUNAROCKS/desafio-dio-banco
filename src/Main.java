
public class Main {

	public static void main(String[] args) {
		Conta CC = new ContaCorrente("Rafael");
		Conta CP = new ContaPoupanca("Neildes");
		
		CC.imprimirExtrato();
		CP.imprimirExtrato();
		CC.depositar(20000);
		CP.depositar(20000);
		CC.sacar(15000);
		CP.transferir(5000, CC);
		System.out.println("////Após as operações////");
		CC.imprimirExtrato();
		CP.imprimirExtrato();
	}

}
