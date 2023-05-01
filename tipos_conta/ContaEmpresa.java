package tipos_conta;

public class ContaEmpresa extends Conta{
	
	private float emprestimoEmpresa;
	
	public ContaEmpresa(int numero, String cpf, float saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);
		this.emprestimoEmpresa = emprestimoEmpresa;
		}

	public float getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(float emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void pedirEmprestimo(float valor) {
		if(emprestimoEmpresa < 10.000) {
		emprestimoEmpresa -= valor;
		saldo += valor;
		}
	}
}	
