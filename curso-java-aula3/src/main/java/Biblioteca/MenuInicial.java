package Biblioteca;

import java.util.Scanner;

public class MenuInicial {

	
	public static int mostrarMenu(Scanner scanner) {
		System.out.println("1.Adicionar Livro");
		System.out.println("2.Buscar Livro");
		System.out.println("3.Remover Livro");
		System.out.println("4.Listar Livros");
		System.out.println("5.Sair");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		
		int opcao = mostrarMenu(scanner);
		Livros xlivro;
		String codigo; 
		
		while (opcao != 5) {
			if (opcao == 1) {//Adicionar livro
				
				scanner.nextLine();
				
				xlivro = new Livros();//recebendo na classe e nao no array final
				
				System.out.println("Digite o Codigo do Livro: ");
				xlivro.setCodigo(scanner.nextLine());
				
				System.out.println("Digite o Nome do Autor: ");
				xlivro.setAutor(scanner.nextLine());
				
				System.out.println("Digite o Titulo do Livro: ");
				xlivro.setTitulo(scanner.nextLine());
				
				//System.out.println("Digite a Data da Publicação: ");
				//xlivro.setData(scanner.nextLine());
				
				if(biblioteca.AdicionarLivro(xlivro) == false){
					System.out.println("Livro ja adicionado");
				}
				else{
					System.out.println("Livro adicionado com sucesso");
				}
								
			}else if(opcao == 2){//buscar livro
				
				scanner.nextLine();
				
				System.out.println("Digite o Codigo do Livro: ");
				codigo = scanner.nextLine();
				
				if(biblioteca.BuscarLivro(codigo) == null)
				{
					System.out.println("Livro nao encontrado");
				}else{
					xlivro = biblioteca.BuscarLivro(codigo);
					biblioteca.ImprimirLivro(xlivro);
				}
				
			}else if(opcao == 3){//remover livro
				scanner.nextLine();
				
				System.out.println("Digite o Codigo do Livro: ");
				codigo = scanner.nextLine();
				
				if(biblioteca.BuscarLivro(codigo) == null)
				{
					System.out.println("Livro nao encontrado");
				}
				else{
					biblioteca.RemoverLivro(codigo);
				}
					
			}else if(opcao == 4){//listar livros
				scanner.nextLine();
				
				biblioteca.ListarLivros();
			}else{
				System.out.println("Opcao invalida!");
			}
			
			opcao = mostrarMenu(scanner);
		}

		scanner.close();

	}

}
