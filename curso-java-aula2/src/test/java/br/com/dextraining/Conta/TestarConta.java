package br.com.dextraining.Conta;

import org.junit.Assert;
import org.junit.Test;

public class TestarConta {

	@Test
	public void Sacar(){
		Conta conta = new Conta();
		
		Assert.assertEquals(Double.valueOf(0),Double.valueOf(conta.sacar(5)));
	}
	
	@Test
	public void Depositar(){
		Conta conta = new Conta();
		
		Assert.assertEquals(Double.valueOf(10),Double.valueOf(conta.depositar(10)));
		Assert.assertEquals(Double.valueOf(5),Double.valueOf(conta.sacar(5)));
	}
}
