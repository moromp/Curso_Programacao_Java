package br.com.dextraining.calculadora;

public class Calculadora {

	public double soma(double valor1, double valor2) {

		return valor1 + valor2;
	}

	public double subtrair(double valor1, double valor2) {

		return valor1 - valor2;
	}

	public double dividir(double valor1, double valor2) {
		
		if (valor2 > 0) {
			return valor1 / valor2;
		} else {
			return 0;
		}
	}

	public double multiplicar(double valor1, double valor2) {

		return valor1 * valor2;
	}

}
