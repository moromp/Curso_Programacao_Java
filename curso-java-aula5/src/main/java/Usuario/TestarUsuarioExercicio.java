package Usuario;

import exceptions.UsuarioInvalidException;

public class TestarUsuarioExercicio {

	public static void main(String[] args) throws UsuarioInvalidException{
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario("mateus", "teste@teste.com", "1234");
		Usuario usuario2 = new Usuario("mateus", "admin@email.com", "123mudar");
		
		try {
			System.out.println("teste usuario 1");
			gerenciador.verificar(usuario);
			System.out.println("ok");
		} catch (UsuarioInvalidException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("teste usuario 2");
			gerenciador.verificar(usuario2);
			System.out.println("ok");
		} catch (UsuarioInvalidException e) {
			System.out.println(e);
		}
	}
}
