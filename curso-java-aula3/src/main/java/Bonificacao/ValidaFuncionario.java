package Bonificacao;

public class ValidaFuncionario {
	
	public static boolean ValidaSalario(double salario, double novoSalario){
		if(novoSalario<salario){
			return false;
		}
		return true;
	}
}
