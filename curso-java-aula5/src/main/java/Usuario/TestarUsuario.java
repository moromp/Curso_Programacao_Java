package Usuario;

import exceptions.ErroValidacaoException;

public class TestarUsuario {

	/* Apresentar o erro sem tratamento
	 * public static void main(String[] args) throws ErroValidacaoException {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario(null, null, null);
		gerenciador.adicionar(usuario);//para a programacao abaixo
		System.out.println("Usuario adicionado com sucesso!");
	}*/
	
	// erro
	public static void main(String[] args){
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario(null, "teste@teste.com", "1234");
		
		/*try{
			gerenciador.adicionar(usuario);//vai parar aqui se der erro
			System.out.println("Usuario adicionado com sucesso!");
		}catch(ErroValidacaoException e){//tratando os erros de exception
			System.out.println(e.getMessage());
		}catch (IllegalArgumentException e){//tratando os erros de IllegalException
			System.out.println("Segundo catch");
		}*/
		
		
		//mas posso trocar td por exception
		/*try{
			gerenciador.adicionar(usuario);//vai parar aqui se der erro
			System.out.println("Usuario adicionado com sucesso!");
		}catch(Exception e){//tratando os erros de exception
			System.out.println("Erro generico");
		}*/
		
		
		try{
			gerenciador.adicionar(usuario);//vai parar aqui se der erro
			System.out.println("Usuario adicionado com sucesso!");
		}catch(Exception e){//tratando os erros de exception
			System.out.println("Erro generico " + e.getMessage());
		}finally{//mesmo dando o erro ele executa o finally
			System.out.println("executando os processos do finally");
		}
		
		System.out.println("liberando recursos");// nao vai executar se dar um exception
		
		
		//aqui pra baixo vai continuar normalmente
	}
}
