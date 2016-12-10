package br.com.dextraining.Conta;

import java.util.Scanner;

public class MenuConta {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conta conta = new Conta();
		
		double saque,deposito;
		int opcao = mostrarMenu(scanner);

		while (opcao != 4) {
			if (opcao == 1) {				
				System.out.println("Ler valor do saque");
				saque = scanner.nextDouble();
				
				if(conta.sacar(saque) == 0){
					System.out.println("Saldo insuficiente");
				}else{
					System.out.println("Seu saldo é: "+ conta.obterSaldo());
				}
				
			}else if(opcao == 2){
				System.out.println("Ler valor do deposito");
				deposito = scanner.nextDouble();
				
				conta.depositar(deposito);
				
				System.out.println("Seu saldo é: "+ conta.obterSaldo());
				
			}else if(opcao == 3){
				System.out.println("Seu saldo é: "+ conta.obterSaldo());
			}else{
				System.out.println("Opcao invalida!");
			}
			
			opcao = mostrarMenu(scanner);
		}

		scanner.close();
	}

	public static int mostrarMenu(Scanner scanner){
		System.out.println("1.Sacar");
	    System.out.println("2.Depositar");
		System.out.println("3.Ver saldo");
		System.out.println("4.Sair");
		return scanner.nextInt();
	}
}
