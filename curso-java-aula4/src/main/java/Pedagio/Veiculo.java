package Pedagio;

public abstract class Veiculo {
	
	private int qtdeixos;

	public int getQtdeixos() {
		return qtdeixos;
	}

	public void setQtdeixos(int qtdeixos) {
		this.qtdeixos = qtdeixos;
	}

	public Veiculo(int qtdeixos) {
		this.qtdeixos = qtdeixos;
	}
}
