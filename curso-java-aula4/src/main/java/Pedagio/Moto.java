package Pedagio;

public class Moto extends Veiculo implements PagaPedagio{

	public Moto() {
		super(2);
	}
	
	public int QuantidadeEixos() {
		return super.getQtdeixos();
	}
}
