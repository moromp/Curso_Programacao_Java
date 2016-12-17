package arrays;

import java.util.Scanner;

public class ArmazenarArray {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		int valores[] = new int[3];
		int soma = 0;
		
		for(int i=0;i<valores.length;i++){
			System.out.println("Digite os " + i + "valores:");
			valores[i] = scanner.nextInt();
		}
		
		for(int i=0;i<valores.length;i++){
			soma = soma + valores[i];
			System.out.println("[" + i + "]: " + valores[i]);
		}
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + soma/3);
		
		scanner.close();
	}

}
