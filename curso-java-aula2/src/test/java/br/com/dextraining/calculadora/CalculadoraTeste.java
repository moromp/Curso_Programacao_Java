package br.com.dextraining.calculadora;



import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

	Calculadora calculadora = new Calculadora();
	double resultado;
	
	
	@Test
	public void testarSoma() {
		resultado = calculadora.soma(10, 15);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado));
	}

	@Test
	public void testarSubtracao() {
		resultado = calculadora.subtrair(10, 15);
		Assert.assertEquals(Double.valueOf(-5), Double.valueOf(resultado));
	}

	@Test
	public void testarDivisao() {
		resultado = calculadora.dividir(20, 10);
		Assert.assertEquals(Double.valueOf(2), Double.valueOf(resultado));
	}

	@Test
	public void testarMultiplicacao() {
		resultado = calculadora.multiplicar(20, 10);
		Assert.assertEquals(Double.valueOf(200), Double.valueOf(resultado));
	}
}
