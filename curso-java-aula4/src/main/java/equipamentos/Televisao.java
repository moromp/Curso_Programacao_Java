package equipamentos;

public class Televisao extends Eletronico{
	
	private int polegadas;

	public Televisao(double preco, String fabricante,int polegadas) {
		super(preco, fabricante);
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
}
