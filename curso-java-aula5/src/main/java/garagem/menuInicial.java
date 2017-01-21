package garagem;

import java.util.Scanner;


public class menuInicial {

	public static int mostrarMenu(Scanner scanner) {
		
		System.out.println("1. Cadastrar");
		System.out.println("2. Vender");
		System.out.println("3. Buscar");
		System.out.println("4. Listar");
		System.out.println("5. Sair");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		garagem garagem = new garagem();
		
		//variaveis ambiente
		String placa="";
		String marca="";
		int ano=0;
		double preco=0;
		
		int opcao = mostrarMenu(scanner);
		
		while (opcao != 5) {
			if (opcao == 1) {//add
				scanner.nextLine();
				
				System.out.println("Digite a Placa do veiculo");
				placa = scanner.nextLine();
				
				System.out.println("Digite a Marca do veiculo");
				marca = scanner.nextLine();
				
				System.out.println("Digite a ano do veiculo");
				ano = scanner.nextInt();
				
				System.out.println("Digite a Preco do veiculo");
				preco = scanner.nextDouble();
				
				carro carro = new carro(placa, marca, ano, preco);
				
				garagem.Adicionar(carro);
								
			}else if(opcao == 2){//vender
				scanner.nextLine();
				
				System.out.println("Digite a Placa do veiculo");
				placa = scanner.nextLine();
				
				garagem.Vender(placa);
				
			}else if(opcao == 3){//buscar
				scanner.nextLine();
				
				System.out.println("Digite a Placa do veiculo");
				placa = scanner.nextLine();
				
				System.out.println(garagem.Buscar(placa));
				
			}else if(opcao == 4){//listar
				scanner.nextLine();
				
				garagem.Listar();
				
			}else{
				System.out.println("Opcao invalida!");
			}
			
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}
}
