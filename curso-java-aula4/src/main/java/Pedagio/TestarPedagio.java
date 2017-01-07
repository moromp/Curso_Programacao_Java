package Pedagio;

public class TestarPedagio {

	public static void main(String[] args) {

		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Moto moto = new Moto();
		Bicicleta bicicleta = new Bicicleta();
		
		CalculadorPedagio calculadorpedagio = new CalculadorPedagio(2.0);
		
		calculadorpedagio.calcular(carro);
		calculadorpedagio.calcular(caminhao);
		calculadorpedagio.calcular(moto);
		//calculadorpedagio.calcular(bicicleta);
	}
}
