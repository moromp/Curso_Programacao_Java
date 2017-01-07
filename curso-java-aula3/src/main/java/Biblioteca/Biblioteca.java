package Biblioteca;

import java.util.Scanner;

import NotasAluno.Aluno;

public class Biblioteca {
	
	int qtd = 100;

	Scanner scanner = new Scanner(System.in);
	Livros livro[] = new Livros[qtd];
	int qtdlivro = 0;

	public boolean AdicionarLivro(Livros nlivro){
		
		if(BuscarLivro(nlivro.getCodigo())!= null){
				return false;
		}
		else{
			livro[qtdlivro] = nlivro;//add no array de livros
			qtdlivro++;
			
			return true;
		}
					
	}

	public Livros BuscarLivro(String codigo) {
		for (Livros nlivro : livro) {
			if(nlivro == null){
				return null;
			}
			
			if(codigo.equals(nlivro.getCodigo()))
			{
				return nlivro;
			}
		}
		return null;
	}

	public void RemoverLivro(String xcod) {
		for(int i=0; i<qtd; i++){
			//fazer o remover
			
		}

	}

	public void ListarLivros() {
		for (Livros nlivro : livro) {
			if(nlivro == null){
				break;
			}
			else{
				System.out.println("Codigo: " + nlivro.getCodigo() + " - Autor: "
					+ nlivro.getAutor() + " - Titulo:  " + nlivro.getTitulo()
					+ " - Data Publicação: " + nlivro.getData());
			}
		}
	}
	
	public void ImprimirLivro(Livros llivro) {
			System.out.println("Codigo: " + llivro.getCodigo() + " - Autor: "
					+ llivro.getAutor() + " - Titulo:  " + llivro.getTitulo()
					+ " - Data Publicação: " + llivro.getData());
	}
}
