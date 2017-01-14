package garagem;

public class carro {

	private String marca;
	private String placa;
	private int ano;
	private double preco;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public carro(String placa, String marca, int ano, double preco) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.ano = ano;
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		carro other = (carro) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Placa: " + placa +" Marca: " + marca + " Ano: " + ano + " Preco: R$" + preco;
	}
	
}
