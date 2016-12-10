package br.com.dextraining.monitor;

public class Monitor {

	public int polegadas;
	public String numeroSerie;
	public String cor;
	public boolean ligado;
	public int brilho;

	//contrutor padrao
	public Monitor(){
		this.ligado = false;
		this.brilho = 50;
	}
	
	//construtor criado manualmente
	public Monitor(int polegadas, String numeroSerie, String cor){
		this.polegadas = polegadas;
		this.numeroSerie = numeroSerie;
		this.cor = cor;
		this.ligado = false;
		this.brilho = 50;
	}
	
	public void ligar() {
		System.out.println("Ligando... ");
		ligado = true;
	}

	public void desligar() {
		System.out.println("Desligando... ");
		ligado = false;
	}

	public int aumentarBrilho() {

		if (brilho < 100) {
			brilho++;
			return brilho;
		}

		return brilho;
	}

	public int diminuirBrilho() {
		
		if (brilho > 0) {
			brilho--;
			return brilho;
		}
		
		return brilho;
	}
	
	public int trocarBrilho(int brilho){
		this.brilho = brilho;//o this nesse caso esta apontando para o brilho do metodo geral, nao do parametro do metodo
		return brilho;
	}

}
