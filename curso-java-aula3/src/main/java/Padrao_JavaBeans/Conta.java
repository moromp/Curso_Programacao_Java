package Padrao_JavaBeans;

public class Conta {

	private double valor;
	
	
	public double obterSaldo(){
	
		return this.getValor();
	}
	
	public boolean sacar(double valor){
		
		if((valor > this.getValor()) || (valor<0)){
			return false;
		}else{
			this.setValor(this.getValor() - valor);
			return true;
		}
		
	}
	
	public boolean depositar(double valor){
		if(valor > 0){
			this.setValor(this.getValor() + valor);
			return true;
		}else{
			return false;
		}
			
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
