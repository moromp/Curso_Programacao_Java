package Pedagio;

public class CalculadorPedagio {

	private double valor;
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public CalculadorPedagio(double valor) {
		this.valor = valor;
	}

	public void calcular(PagaPedagio objeto){
		System.out.println(objeto.QuantidadeEixos() * this.valor);
	}
}
