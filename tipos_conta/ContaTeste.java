package tipos_conta;

import java.util.Scanner;

public class ContaTeste {
	
	static Scanner input = new Scanner(System.in);
	
	public static void selecaocontas() {
		
		System.out.println("|      Banco ProsperMoney +5658    |");
		System.out.println("|               ***                |");
		System.out.println("|Aqui o seu dinheiro irá prosperar!|");
		System.out.println("|                                  |");
		System.out.println("|----------------------------------|");
		System.out.println("|               MENU               |");
		System.out.println("|----------------------------------|");
	    System.out.println("|    Opção 1 - Conta Poupança      |");
	    System.out.println("|    Opção 2 - Conta Corrente      |");
	    System.out.println("|    Opção 3 - Conta Especial      |");
	    System.out.println("|    Opção 4 - Conta Empresa       |");
	    System.out.println("|    Opção 5 - Conta Estudantil    |");
	    System.out.println("|    Opção 6 - Sair                |");
	    System.out.println("|----------------------------------|");
	    System.out.println("Digite a opção que deseja abrir: ");
	    
		} 
	
	
	  public static void selecaomovimentacao (float saldoatual, String tipoconta) {
		System.out.println("|      Banco ProsperMoney +5658    |");
		System.out.println("|               ***                |");
		System.out.println("|Aqui o seu dinheiro irá prosperar!|");
		System.out.println("|                ***               |");
		System.out.println("|----------------------------------|");  
		System.out.println("| CONTA" + " " + tipoconta +      "                   "+"|");
		System.out.println("|----------------------------------|");
		System.out.println("\nSaldo Atual: R$ " + saldoatual);
		System.out.println("MOVIMENTO - D- Débito ou C-Crédito: ");
		
		}
	  
	  public static void main(String[] args) {
			
		 int dataAniversário, movimentacoesConta = 10, qtdCheque=0;
		 float valor, limiteSaldo, emprestimoValor;
		 char movimentadebitocredito = 0, continuarMovimentacao = 'S', pedidoCheque, pedidoEmprestimo = 'S', emprestimoPedidoEs = 'S';
		    
		 ContaPoupanca Cpoupanca = new ContaPoupanca(5784, "423.884.663-x", 7500, true, 27);
		 ContaCorrente Ccorrente = new ContaCorrente(7352, "456.163.587.13", 4500, true);
		 ContaEspecial Cespecial = new ContaEspecial(0756, "471.225.552-27", 300, true);
		 ContaEmpresa Cempresarial = new ContaEmpresa(1001, "123.556.897.98", 4000, true);
		 ContaEstudantil Cestudante = new ContaEstudantil(6568, "336.554.995.10", 2500, true);
	    
	  	selecaocontas();
	    int selecao = input.nextInt();
		
		switch(selecao) {
		case 1: 
			if (Cpoupanca.ativo) {
	            while (continuarMovimentacao == 'S') {
	              if(movimentacoesConta != 0){
		                if(Cpoupanca.saldo > 0){
		                	System.out.println("Digite o dia do aniversario da poupança: ");
		                	dataAniversário = input.nextInt();
		                  Cpoupanca.correcao(dataAniversário);
		                  selecaomovimentacao(Cpoupanca.saldo, "POUPANÇA");
		                  continuarMovimentacao = input.next().charAt(0);  
		                  System.out.println("Valor da movimentação: R$: ");
		                  valor = input.nextFloat();
		                  if (movimentadebitocredito == 'D') {
		                   Cpoupanca.debito(valor);                 
		                  }
		                  if (movimentadebitocredito== 'C') {
		                    Cpoupanca.credito(valor);		       
		                  }
		                  movimentacoesConta -= 1;
		                  System.out.println("Deseja continua as movimentações? S/N: ");
		                  continuarMovimentacao = input.next().charAt(0);
		                } else {
		                  System.out.println("Sua conta esta negativa!");
		                  break;
		                }
		              }            
		            }
		          } 
		case 2:
			if (Ccorrente.ativo) {
	            while (continuarMovimentacao == 'S') {
	              if(movimentacoesConta != 0) {
	               if(Ccorrente.saldo > -1){
		               selecaomovimentacao(Ccorrente.saldo, "CORRENTE");
		               continuarMovimentacao = input.next().charAt(0);
	                  System.out.println("Valor da movimentação: R$: ");
	                  valor = input.nextFloat();
	                  if (movimentadebitocredito == 'D') {
	                    Ccorrente.debito(valor);
	                  }
	                  if (movimentadebitocredito == 'C') {
	                	  Ccorrente.credito(valor);
	                  }
	                  movimentacoesConta -= 1;
	                  System.out.println("Deseja continua as movimentações? S/N: ");
	                  continuarMovimentacao = input.next().charAt(0);
	                } else {
		                  System.out.println("Sua conta esta negativa!");
		                  break;
	              }
	          }
		}
	            System.out.println("Você deseja solicitar cheque S/N ? ");
	            pedidoCheque = input.next().charAt(0);
	            if(Ccorrente.saldo > 0){
	              if (pedidoCheque == 'S') {
	                System.out.println("Quantos cheques deseja solicitar?:  ");
	                qtdCheque = input.nextInt();
	                if (qtdCheque <= 3) {
	                  Ccorrente.pediTalao(qtdCheque);
	                  Ccorrente.debito((qtdCheque * 30));
                  selecaomovimentacao(Ccorrente.saldo, "CORRENTE");
	                } else {
	                  System.out.println("Você só tem direito a 3 cheques!");
	                }
	              }
	            } else {
	              System.out.println("Sua conta esta negativa!");
	              break; 
	            }
	              
	          } 

        case 3:
        	 if (Cespecial.ativo) {
        		 Cespecial.setLimite(1000);
                 while (continuarMovimentacao == 'S') {
                   if(movimentacoesConta != 0) {
                	   selecaomovimentacao(Cespecial.saldo, "ESPECIAL");
                	   movimentadebitocredito = input.next().charAt(0);
                     System.out.println("Valor da movimentação: R$: ");
                     valor = input.nextFloat();
                     if (Cespecial.getLimite() != 0) {
                       if (movimentadebitocredito == 'D') {
                         if (Cespecial.saldo == 0) {
                        	 Cespecial.usarLimite(valor);
                        	 Cespecial.saldo = 0;
                         }
                         if (Cespecial.saldo < valor && Cespecial.saldo != 0) {
                           valor = valor - Cespecial.saldo;
                           Cespecial.saldo = 0;
                           Cespecial.usarLimite(valor);
                         }
                         if (Cespecial.saldo >= valor) {
                        	 Cespecial.debito(valor);
                         }
                         System.out.println("Você tem : " + Cespecial.getLimite() + " de limite");
                         System.out.println("Seu saldo é de: " + Cespecial.saldo);
                       }
                       if (movimentadebitocredito == 'C') {

                         if (Cespecial.getLimite() < 1000) {
                        	 limiteSaldo = 1000 - Cespecial.getLimite();
                           valor = valor - limiteSaldo;
                           Cespecial.saldo = valor;
                           Cespecial.setLimite(1000);
                         }
                         if (Cespecial.getLimite() == 1000) {
                        	 Cespecial.credito(valor);
                         }
                         System.out.println("Você tem: " + Cespecial.getLimite() + " de limite");
                         System.out.println("Seu saldo é de: " + Cespecial.saldo);
                         selecaomovimentacao(Cespecial.saldo, "ESPECIAL");
                         }
                       } else {
                         System.out.println("Você usou todo seu limite");
                         break;
                       }
                     movimentacoesConta -= 1;
                       System.out.println("Deseja continuar as movimentações? S/N: ");
                       continuarMovimentacao = input.next().charAt(0);
                   } else {
		                  System.out.println("Sua conta esta negativada!!!");
		                  break;
                 }
                }
        	 }
		 
        case 4:
        	if (Cempresarial.ativo) {
        		Cempresarial.setEmprestimoEmpresa(10000);
                while (continuarMovimentacao == 'S') {
                  if(movimentacoesConta != 0) {     
                      if(Cempresarial.saldo > -1) {
                    	  selecaomovimentacao(Cempresarial.saldo, "EMPRESA");
                    	  movimentadebitocredito = input.next().charAt(0);
                        System.out.println("Valor da movimentação: R$: ");
                        valor = input.nextFloat();
                        if (movimentadebitocredito == 'D') {
                        	Cempresarial.debito(valor);
                        }
                        if (movimentadebitocredito == 'C') {
                        	Cempresarial.credito(valor);
                        }
                  System.out.println("Você deseja solicitar emprestimo? S/N: ");
                  	pedidoEmprestimo = input.next().charAt(0);     
                        if(pedidoEmprestimo == 'S') {
                          if(Cempresarial.getEmprestimoEmpresa() > 0) {
                            System.out.println("Valor do emprestimo: ");
                            emprestimoValor = input.nextFloat();
                            Cempresarial.pedirEmprestimo(emprestimoValor);
                            Cempresarial.saldo += emprestimoValor;
                            System.out.println("Seu saldo é de: R$ " + Cempresarial.saldo);
                            System.out.println("Você tem: R$ " + Cempresarial.getEmprestimoEmpresa() + " de limite");
                          }else {
                              System.out.println("Você não possui mais valor de limite para emprestimo");
                          }                    
                        } 
                        movimentacoesConta -= 1;
                        System.out.println("Deseja continuar as movimentações? S/N: ");
                        continuarMovimentacao = input.next().charAt(0);
                      }
                      else {
                    	  System.out.println("sua conta está negativada");  
                    	  break;
                      }
                  }else {   
                      if(movimentacoesConta == 10) {
                        System.out.println("Valor do emprestimo: ");
                        emprestimoValor = input.nextFloat();
                        Cempresarial.pedirEmprestimo(emprestimoValor);
                        System.out.println("Seu saldo é de: R$ " + Cempresarial.saldo);
                        System.out.println("Você tem: R$ " + Cempresarial.getEmprestimoEmpresa() + " de limite");
                      }
                   } 
                }      
               }else{
                System.out.println("sua conta está negativada");  
               }
                      break;

        case 5:
             if (Cestudante.ativo) {
            	 Cestudante.setLimiteEstudantil(5000);
          while (continuarMovimentacao == 'S') {
            if(movimentacoesConta != 0) {     
                if(Cestudante.saldo > -1) {
                	selecaomovimentacao(Cestudante.saldo, "ESTUDANTIL");
                	movimentadebitocredito = input.next().charAt(0);
                  System.out.println("Valor da movimentação: R$: ");
                  valor = input.nextFloat();
                  if (movimentadebitocredito == 'D') {
                	  Cestudante.debito(valor);
                  }
                  if (movimentadebitocredito == 'C') {
                	  Cestudante.credito(valor);
                  }
                  System.out.println("Você deseja solicitar emprestimo? S/N: ");
                  emprestimoPedidoEs = input.next().charAt(0);
                  if(emprestimoPedidoEs == 'S') {
                    if(Cestudante.getLimiteEstudantil() > 0) {
                      System.out.println("Valor Emprestimo: ");
                      emprestimoValor = input.nextFloat();
                      Cestudante.usarEstudantil(emprestimoValor);
                      Cestudante.saldo += emprestimoValor;
                      System.out.println("Seu saldo é de: R$ " + Cestudante.saldo);
                      System.out.println("Você tem: R$ " + Cestudante.getLimiteEstudantil() + " de limite");
                    }else {
                      System.out.println("Você não possui mais valor de limite para emprestimo");
                    }                    
                  } 
                  movimentacoesConta -= 1;
                  System.out.println("Deseja continuar as movimentações? S/N: ");
                  continuarMovimentacao = input.next().charAt(0);
                } 
                else {
                  System.out.println("Sua conta esta negativa!");
                  break; 
                }
            } else {
                if(movimentacoesConta == 10) {
                  System.out.println("Valor do emprestimo: ");
                  emprestimoValor = input.nextFloat();
                  Cestudante.usarEstudantil(emprestimoValor);
                  System.out.println("Seu saldo é de: R$ " + Cestudante.saldo);
                  System.out.println("Você tem: R$ " + Cestudante.getLimiteEstudantil()+ " de limite");
                }
              }          
          }

        } else {
          System.out.println("sua conta não está ativa");
        }
        break;
			
		case 6: 
			System.out.println("Até mais! Foi um prazer ver seu dinheiro prosperar conosco! :)");
			System.exit(0);
			
		default: 
			System.out.println("Opção Inválida!");
			selecaocontas();
			break;
		}		
	}	
		
	}

	

