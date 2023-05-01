package tipos_conta;

//Classe filha extends da classe mãe

public class ContaPoupanca extends Conta{

// Atributo classe filha
	
		private int diaAniversarioPoupanca;
		
// Método Construtor da classe super		
		
		public ContaPoupanca(int numero,String cpf, float saldo, boolean ativo, int diaAniversarioPoupanca){
			super(numero, cpf, saldo, ativo);
			this.diaAniversarioPoupanca = diaAniversarioPoupanca;	
		}
		
// Método get and set		

		public int getDiaAniversarioPoupanca() {
			return diaAniversarioPoupanca;
		}

		public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
			this.diaAniversarioPoupanca = diaAniversarioPoupanca;
		}

// Método(ação da regra de negócio)		
		
		public void correcao(int diaAniversarioPoupanca) {
			if(this.diaAniversarioPoupanca == diaAniversarioPoupanca) {		
				saldo = (float) ((saldo * 0.05) + saldo);		
			}else {
				System.out.println("Erro!O dia do aniversário da poupança é incorreto");				
			}
		}
}
