package Pedagio;

public class Caminhao extends Veiculo implements PagaPedagio{

	public Caminhao() {
		super(6);
	}
	
	public int QuantidadeEixos() {
		return super.getQtdeixos();
	}
}
