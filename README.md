# Tech Afro Pretas
Trilha de formação em desenvolvimento em Java do programa Tech Afro Pretas. Programa de formação do BEES e da Prospertech.

***Objetivo do Projeto:***

Elabore um sistema computacional, de uma conta bancária , utilizando os principais conceitos estudados em Java das primeiras semanas de trilha.

***Conhecimentos estudados que deverão ser aplicados no projeto:***

● Entrada e saída de dados;
● Laços Condicionais;

● Laços de Repetição;

● Métodos e Modificadores de acesso;

● Classes, Atributos e Objetos;

● Polimorfismo, Herança e Sobrecarga;

● Classes Abstratas e Interfaces;

***REQUISITOS:***

Criar classe Conta:
 - inteiro : numero
 - cadeia : cpf
 -  real: saldo
 -  logico: ativo
 - Método débito e crédito;
 - proteção total;
 - alterando o saldo, o mesmo não pode ser ajustado  por setter;
 - numero e o cpf [construtor];
 
Criar classes extends (5 tipos de contas, Conta Poupança, Conta Corrente, Conta Especial, Conta Empresarial e Conta Estudantil.);

*ContaPoupanca:*
inteiro: diaAniversarioPoupanca;
Método: (+) correcao  (soma no saldo);
Regra de negócio: Comparar se a data informada pelo usuario é a mesma data do dia do aniversário, se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo;

*ContaCorrente:*

inteiro: contadorTalao;

Método: (+) pediTalao  - [não é no saldo]

Regra de negócio: Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar cheque, limitando em apenas 3 cheques. cada talão debita a conta em R$ 30.00;

*Conta Especial:*

real: limite;

Método: ((+) usarLimite (soma no saldo e tira do limite);

Regra de negócio: Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta no saldo e diminuir no limite.Limite de R$ 1.000;

*Conta Empresarial:*

real: emprestimoEmpresa;

Método: (+) pedirEmprestimo (soma no saldo e tira do empresitmo);

Regra de negócio: Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo (limitado a R$ 10.000) levando o valor para o saldo;

*Conta Estudantil:*

real: limiteEstudantil;

Método: (+) usarEstudantil (soma no saldo - tira do estudantil);

Regra de negócio: Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo estudantil (limitado a R$ 5.000) levando o valor para o saldo;

***REGRAS GERAIS:***
- 10 MOVIMENTOS - DEBITO OU CREDITO;
- SALDO ZERO É POSSIVEL;
- NENHUMA CONTA PODE FICA NEGATIVA DEPOIS DOS POSSIVEIS 10 MOVIMENTOS;
- O BANCO DEVER TER UM NOME + G[NUMERO GRUPO];
- O BANCO DEVER TER UM SLOGAN (EX: BANCO Miiiiii-lhão - G0 - Aqui ninguém é MIzeravi!;
