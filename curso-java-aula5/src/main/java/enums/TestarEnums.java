package enums;

public class TestarEnums {

	public static void main(String[] args) {
		
		TipoPecaXadrez tipo = TipoPecaXadrez.BISPO;
		System.out.println(tipo);//imprime o valor BISPO
		
		System.out.println(tipo.name());//imprime o valor BISPO

		TipoPecaXadrez[] values = TipoPecaXadrez.values();
		TipoPecaXadrez valorposicao1 = values[1];
		
		System.out.println(valorposicao1);//imprime o valor texto
		System.out.println(valorposicao1.ordinal());//imprime a posiçao {0,1,2,3,4,...}
		
	}

}
