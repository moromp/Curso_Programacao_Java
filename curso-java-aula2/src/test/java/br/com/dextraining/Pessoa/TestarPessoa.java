package br.com.dextraining.Pessoa;

import java.util.Scanner;

public class TestarPessoa {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String nome,rg,cpf;
		
		System.out.println("Informe o NOME da pessoa: ");
		nome = scanner.nextLine();
		
		System.out.println("Informe o CPF da pessoa: ");
		cpf = scanner.nextLine();
		
		System.out.println("Informe o RG da pessoa: ");
		rg = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa(nome,cpf,rg);
		System.out.println(pessoa);
		
		scanner.close();
	}
}
