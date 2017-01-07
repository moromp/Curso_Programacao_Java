package folhapagamento;

public class FolhaPagamento {

	public double calcular(Funcionario...funcionarios){
		double salario=0;
		
		for(Funcionario xfunc: funcionarios){
			salario += xfunc.getSalarioComBonificacao();
		}
		
		return salario;
	}
	
}
