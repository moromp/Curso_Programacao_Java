package Pedagio;

public class Carro extends Veiculo implements PagaPedagio{

	public Carro() {
		super(4);
	}

	public int QuantidadeEixos() {
		return super.getQtdeixos();
	}
}
