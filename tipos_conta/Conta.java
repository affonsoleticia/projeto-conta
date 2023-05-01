package tipos_conta;

abstract class Conta {
	
// Atributos da classe conta

	private int numero;
	private String cpf;
	protected float saldo;
	boolean ativo;
	
// Método construtor
	
	public Conta(int numero, String cpf, float saldo, boolean ativo) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
	}

// Método get e set	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

/*    public void setSaldo(float saldo) {
		this.saldo = saldo;
	} */

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
		
//Método ação regra negócio
	
	public String debito(float valor) {
		if (ativo) {
			saldo = saldo - valor;
			return "Débito realizado!";
			
		}else {
			return( "Saldo insuficiente para realizar operação");
		}
	}
	
	public void credito(float valor) {
		if(ativo) {
			saldo = saldo + valor;
		}
	}
	        
}
