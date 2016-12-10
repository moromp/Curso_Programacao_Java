package br.com.dextraining.Lampada;

public class Lampada {
	double numWatts;
	String fabricante;
	public boolean ligada = false;
	
	
	public Lampada(double numWatts, String fabricante) {
		this.numWatts = numWatts;
		this.fabricante = fabricante;
	}
	
	public void ligar(){
		System.out.println("Ligando..");
		ligada = true;
	}
	
	public void Desligar(){
		System.out.println("Desligando");
		ligada = false;
	}
	
	public boolean estaLigada(){
		return ligada;
	}

}
