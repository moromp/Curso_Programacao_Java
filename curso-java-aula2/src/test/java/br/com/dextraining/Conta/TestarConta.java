package br.com.dextraining.Conta;

import org.junit.Assert;
import org.junit.Test;

public class TestarConta {

	@Test
	public void SacarValorInvalido(){
		Conta conta = new Conta();
		
		Assert.assertEquals(false,conta.sacar(5));
	}
	
	@Test
	public void SacarValorValido(){
		Conta conta = new Conta();
		Assert.assertEquals(true,conta.depositar(10));
		Assert.assertEquals(true,conta.sacar(5));
	}
	
	@Test
	public void DepositarValorInvalido(){
		Conta conta = new Conta();
		
		Assert.assertEquals(false,conta.depositar(-5));
	}
	
	@Test
	public void DepositarValorValido(){
		Conta conta = new Conta();
		
		Assert.assertEquals(true,conta.depositar(10));
	}
}
