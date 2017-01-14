package Datas;

public class TestarData {

	public static void main(String[] args) {
		
		Data novadata = new Data(31,Meses.DEZEMBRO,2017);//valida data
		System.out.println(novadata);
		
		novadata = new Data(29,Meses.FEVEREIRO,2020);//valida ano bisexto
		System.out.println(novadata);
		
		novadata = new Data(31,Meses.ABRIL,2052);//valida data, com erro nao existe 31 em abril
		System.out.println(novadata);
	}
}
