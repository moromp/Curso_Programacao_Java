package Usuarios;

public class ValidadorSenha {

	//qdo declaro como static nao preciso fazer declaração é só chamar direto
	public static boolean validar(String senha){
		if(senha.length() < 5){
			return false;
		}
		
		return comtemLetra(senha) && comtemNumero(senha);
	}
	
	
	public static boolean comtemLetra(String senha){
		for(char caracteres : senha.toCharArray()){
			if(Character.isLetter(caracteres)){
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean comtemNumero(String senha){
		for(char caracteres : senha.toCharArray()){
			if(Character.isDigit(caracteres)){
				return true;
			}
		}
		
		return false;
	}
}
