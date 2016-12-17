package arrays;

import java.util.Scanner;

public class ArmazenarArray {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		int valores[] = new int[3];
		int soma = 0;
		
		System.out.println("Digite os 3 valores:");
		valores[0] = scanner.nextInt();
		valores[1] = scanner.nextInt();
		valores[2] = scanner.nextInt();
		
		
		for(int i=0;i<valores.length;i++){
			soma = soma + valores[i];
			System.out.println("[" + i + "]: " + valores[i]);
		}
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + soma/3);
		
		scanner.close();
	}

}
