package equipamentos;

public class Equipamento {

	private double preco;
	private String fabricante;
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	public Equipamento(double preco, String fabricante) {
		this.preco = preco;
		this.fabricante = fabricante;
	}
	
	public double calcularPrecoFinal(){
		return this.preco;
	}
	
	//classe de sobrecarga de classe
	public double calcularPrecoFinal(double porcentagem){
		double novopreco = this.calcularPrecoFinal();
		novopreco = novopreco + (novopreco * porcentagem/100);
		return novopreco;
	}
}
