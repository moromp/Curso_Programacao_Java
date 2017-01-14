package Usuario;

import exceptions.ErroValidacaoException;
import exceptions.UsuarioInvalidException;

public class GerenciadorUsuario {

	public void adicionar(Usuario usuario) throws ErroValidacaoException{
		
		if (usuario.getSenha() == null) {
			throw new ErroValidacaoException("O campo senha eh obrigatorio");
		}

		if (usuario.getEmail() == null) {
			throw new ErroValidacaoException("O campo email eh obrigatorio");
		}

		if (usuario.getNome() == null) {
			throw new ErroValidacaoException("O campo nome eh obrigatorio");
		}
		
		throw new IllegalArgumentException("Erro qualquer");
		
		//TODO: Salvar no banco
	}
	
	
	public void verificar(Usuario usuario) throws UsuarioInvalidException{
		
		if(!usuario.getEmail().equals("admin@email.com")){
			throw new UsuarioInvalidException();
		}
		
		if(!usuario.getSenha().equals("123mudar")){
			throw new UsuarioInvalidException();
		}
	}
}
