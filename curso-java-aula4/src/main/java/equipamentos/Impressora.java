package equipamentos;

public class Impressora extends Equipamento{

	public Impressora(double preco, String fabricante) {
		super(preco, fabricante);
	}
	
	//method de substituicao
	public double calcularPrecoFinal(){
		
		double porcentagem = 5;
		double novopreco = super.calcularPrecoFinal();
		//double novopreco = super.getPreco(); // vai retornar a mesma coisa da consulta anterior
		
		novopreco = novopreco + (novopreco*porcentagem/100);
		
		return novopreco;
	}
}
