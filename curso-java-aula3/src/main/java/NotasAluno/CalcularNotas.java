package NotasAluno;

import java.util.Scanner;

public class CalcularNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qtd=0;
		
		System.out.println("Digite a quantidade de Alunos:");
		qtd = scanner.nextInt();//vai pegar o numero
		scanner.nextLine();//vai pegar o enter do teclado, senao ele passa reto e nao para no proximo
		
		double soma;
		Aluno aluno[] = new Aluno[qtd];
		
		//lendo aluno e notas
		for(int i=0;i<qtd;i++){
			
			aluno[i] = new Aluno();//setando senao ele fica com o valor null e nao deixa receber o valor
			
			System.out.println("Digite o nome do Aluno");
			aluno[i].nome = scanner.nextLine();
			
			
			for(int j=0;j<3;j++){
				System.out.println("Digite a nota do Aluno: " + aluno[i].nome);
				aluno[i].notas[j] = scanner.nextDouble();
				scanner.nextLine();//vai pegar o enter do teclado, senao ele passa reto e nao para no proximo
			}
			
		}
		
		//imprimir notas e media
		/*for(int i=0;i<qtd;i++){
			soma = 0;
			System.out.print("\n"+aluno[i].nome + " ");
			for(int j=0;j<3;j++){
				soma += aluno[i].notas[j];
				System.out.print(aluno[i].notas[j] + " ");
			}
			System.out.print(soma/3);
		}*/
		
		//mesmo processo do anterior mas mais simples e mais limpo e com os for
		for(Aluno impressaoalunos: aluno)
		{
			System.out.print("\n"+impressaoalunos.nome + " ");
			for(double nota : impressaoalunos.notas){
				System.out.print(nota + " ");
			}
			System.out.print(impressaoalunos.getMedia());
		}
		
		scanner.close();
	}
	
	

}
