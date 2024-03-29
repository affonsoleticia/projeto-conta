package tipos_conta;

public class ContaEstudantil extends Conta{
	
	private float limiteEstudantil;
	
	public ContaEstudantil(int numero, String cpf, float saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		this.limiteEstudantil = limiteEstudantil;
		}

	public float getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(float limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}

	public void usarEstudantil(float valor) {
		limiteEstudantil -= valor;
		saldo += valor;
	}
	
}
