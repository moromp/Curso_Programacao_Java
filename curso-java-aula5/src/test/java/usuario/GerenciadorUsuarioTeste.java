package usuario;

import org.junit.Test;

import exceptions.ErroValidacaoException;
import exceptions.UsuarioInvalidException;
import Usuario.GerenciadorUsuario;
import Usuario.Usuario;

public class GerenciadorUsuarioTeste {
	
	private GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();

	@Test(expected = ErroValidacaoException.class)
	public void testarAdicionarSemNome() throws ErroValidacaoException {
		Usuario usuario = new Usuario(null, "email@email.com", "123456");
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test(expected = ErroValidacaoException.class)
	public void testarAdicionarSemEmail() throws ErroValidacaoException {
		Usuario usuario = new Usuario("mateus", null, "123456");
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test(expected = ErroValidacaoException.class)
	public void testarAdicionarSemSenha() throws ErroValidacaoException {
		Usuario usuario = new Usuario("mateus", "email@email.com", null);
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test(expected = UsuarioInvalidException.class)
	public void testarValidacaoComUsuarioValido() throws UsuarioInvalidException {
		Usuario usuario = new Usuario("mateus", "admin@email.com", "1234");
		gerenciadorUsuario.verificar(usuario);
	}
	
	@Test(expected = UsuarioInvalidException.class)
	public void testarValidacaoComEmailInvalido() throws UsuarioInvalidException {
		Usuario usuario = new Usuario("mateus", "null", "123mudar");
		gerenciadorUsuario.verificar(usuario);
	}
}
