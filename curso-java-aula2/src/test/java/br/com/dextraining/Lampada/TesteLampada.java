package br.com.dextraining.Lampada;

import org.junit.Assert;
import org.junit.Test;

public class TesteLampada {

	@Test
	public void testarLigar(){
		Lampada lampada = new Lampada(60,"Philips"); 
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		Assert.assertTrue(lampada.estaLigada());
	}
	
	@Test
	public void testarDesligar(){
		Lampada lampada = new Lampada(60,"Philips"); 
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		Assert.assertTrue(lampada.estaLigada());
		interruptor.apertar();
		Assert.assertFalse(lampada.estaLigada());
	}
}
