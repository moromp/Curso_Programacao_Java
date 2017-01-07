package equipamentos;

public class Impressora extends Equipamento{

	public Impressora(double preco, String fabricante) {
		super(preco, fabricante);
	}
	
	//metodo de substituicao da classe pai
	public double calcularPrecoFinal(){
		
		double porcentagem = 5;
		double novopreco = super.calcularPrecoFinal();
		
		novopreco = novopreco + (novopreco*porcentagem/100);
		
		return novopreco;
	}
}
