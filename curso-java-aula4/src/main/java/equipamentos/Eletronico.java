package equipamentos;

public class Eletronico extends Equipamento {

	public Eletronico(double preco, String fabricante) {
		super(preco, fabricante);
	}

	// method de substituicao
	public double calcularPrecoFinal() {

		double porcentagem = 10;
		double novopreco = super.calcularPrecoFinal();
		novopreco = novopreco + (novopreco * porcentagem / 100);

		return novopreco;
	}
}
