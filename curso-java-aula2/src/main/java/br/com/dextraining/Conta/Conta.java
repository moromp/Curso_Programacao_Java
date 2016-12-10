package br.com.dextraining.Conta;

public class Conta {

	double valor;
	
	
	public double obterSaldo(){
	
		return this.valor;
	}
	
	public double sacar(double valor){
		
		if(valor > this.valor){
			return 0;
		}else{
			this.valor = this.valor - valor;
			return this.valor;
		}
		
	}
	
	public double depositar(double valor){
		
		return this.valor = this.valor + valor;
	}
}
