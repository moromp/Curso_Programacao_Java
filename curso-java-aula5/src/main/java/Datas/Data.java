package Datas;

public class Data {

	Meses mes;
	int	dia;
	int ano;

	public Data(int dia, Meses mes, int ano) {
		if(!this.Validadata(dia, mes, ano)){
			throw new IllegalArgumentException("Data invalida!");
		}
		else{
			this.mes = mes;
			this.dia = dia;
			this.ano = ano;
		}
	}
	
	public String toString(){
		return dia +"/"+ (mes.ordinal()+1) +"/"+ ano;
	}
	
	public boolean Validadata(int dia, Meses mes, int ano){
		int resto = ano%4;
		int anobisexto = 0;
		
		if(resto == 0)
			anobisexto = 1;
		
		if(mes == Meses.FEVEREIRO){
			if(anobisexto == 1){
				if((dia <= mes.qtdias +1) && (dia>0)){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				if((dia <= mes.qtdias) && (dia>0)){
					return true;
				}
				else{
					return false;
				}
			}
		}
		else{
			if((dia <= mes.qtdias) && (dia>0)){
				return true;
			}
			else{
				return false;
			}
		}
	}
}
