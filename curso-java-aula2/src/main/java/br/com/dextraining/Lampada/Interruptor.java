package br.com.dextraining.Lampada;

public class Interruptor {

	Lampada lampada;
	
	public Interruptor(Lampada lampada) {
		super();
		this.lampada = lampada;
	}



	public void apertar(){
		if(lampada.estaLigada()){
			lampada.Desligar();
		}
		else{
			lampada.ligar();
		}
			
	}
}
