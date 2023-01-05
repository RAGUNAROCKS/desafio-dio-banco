
public class ContaCorrente extends Conta{
	
	private static int SEQUENCIAL = 0;
	
	public ContaCorrente(String nome) {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
		super.cliente = new Cliente();
		cliente.setNome(nome);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
