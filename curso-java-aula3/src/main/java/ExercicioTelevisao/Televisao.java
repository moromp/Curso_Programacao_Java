package ExercicioTelevisao;

public class Televisao {
	
	String modelo;
	String cor;
	int tamanho;
	int voltagem;

	
	public void ligar(){
		System.out.println("Ligar");
		ajustarVoltagem();
		ligarTela();
		regularDiodo();
	}
	
	public void desligar(){
		System.out.println("Desligar");
	}
	
	public void aumentarVolume(){
		System.out.println("Aumentar Volume");
	}
	
	public void diminuirVolume(){
		System.out.println("Diminuir Volume");
	}
	
	private void ajustarVoltagem(){
		System.out.println("Ajustar voltagem");
	}
	
	public void aumentarCanal(){
		System.out.println("Aumentar Canal");
	}
	
	public void diminuirCanal(){
		System.out.println("Diminuir Canal");
	}
	
	private void ligarTela(){
		System.out.println("Ligar Tela");
	}
	
	private void regularDiodo(){
		System.out.println("Regular Diodo");
	}
	
}
