
public class ContaCorrente extends Conta{
	
	private static int SEQUENCIAL = 0;
	
	public ContaCorrente() {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
