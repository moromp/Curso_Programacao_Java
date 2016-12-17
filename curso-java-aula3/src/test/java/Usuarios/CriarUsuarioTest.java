package Usuarios;

import org.junit.Assert;
import org.junit.Test;

public class CriarUsuarioTest {
	
	@Test
	public void testarComSenhaValida(){
		String senhaValida = "123456789a";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Mateus");
		usuario.setEmail("mateus@email.com");
		usuario.setSenha(senhaValida);
		
		Assert.assertEquals(senhaValida,usuario.getSenha());
	}
	
	@Test
	public void testarComSenhaInvalidaFaltandoLetra(){
		String senhaValida = "123456789a";
		String senhaInvalida = "1215415412145";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Mateus");
		usuario.setEmail("mateus@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida,usuario.getSenha());
	}
	
	@Test
	public void testarComSenhaInvalidaSemNumero(){
		String senhaValida = "123456789a";
		String senhaInvalida = "dgdfsd";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Mateus");
		usuario.setEmail("mateus@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida,usuario.getSenha());
	}
	
	@Test
	public void testarComSenhaInvalidaMenor(){
		String senhaValida = "123456789a";
		String senhaInvalida = "dgd1";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Mateus");
		usuario.setEmail("mateus@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida,usuario.getSenha());
	}


}
