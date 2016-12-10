package br.com.dextraining.Conta;

public class Conta {

	double valor;
	
	
	public double obterSaldo(){
	
		return this.valor;
	}
	
	public boolean sacar(double valor){
		
		if((valor > this.valor) || (valor<0)){
			return false;
		}else{
			this.valor = this.valor - valor;
			return true;
		}
		
	}
	
	public boolean depositar(double valor){
		if(valor > 0){
			this.valor = this.valor + valor;
			return true;
		}else{
			return false;
		}
			
	}
}
