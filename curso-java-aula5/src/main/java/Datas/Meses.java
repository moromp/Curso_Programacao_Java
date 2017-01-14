package Datas;

public enum Meses {
	JANEIRO(31),FEVEREIRO(28),MARCO(31),ABRIL(30),MAIO(31),JUNHO(30),JULHO(31),AGOSTO(31),SETEMBRO(30),OUTUBRO(31),NOVEMBRO(30),DEZEMBRO(31);
	
	final int qtdias;

	private Meses(int qtdias) {
		this.qtdias = qtdias;
	}	
}
