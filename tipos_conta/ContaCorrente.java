package tipos_conta;

//Classe filha extends da classe mãe

public class ContaCorrente extends Conta {
	
	private int contadorTalao;
	
// Método Construtor da super
	
	public ContaCorrente(int numero, String cpf, float saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		this.contadorTalao = contadorTalao;
	}

// Método get and set	
	
	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
	this.contadorTalao = contadorTalao;
	}
		
// Método ação da regra de negócio
	
	public void pediTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao; 
	}
	
}
