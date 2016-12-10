package br.com.dextraining.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;

public class MonitorTeste {

	Monitor monitor;

	@Test
	public void testarCriacaoMonitorOriginal() {

		monitor = new Monitor();
		monitor.cor = "PRETO";
		monitor.polegadas = 20;
		monitor.numeroSerie = "1";

		AssertVerifica();//classe iguais
	}

	public void testarCriacaoMonitorManual() {

		monitor = new Monitor(20, "1", "PRETO");

		AssertVerifica();//classe iguais
	}
	
	private void AssertVerifica() {
		Assert.assertNotNull(monitor);
		Assert.assertEquals("PRETO", monitor.cor);
		Assert.assertEquals("1", monitor.numeroSerie);
		Assert.assertEquals(20, monitor.polegadas);
		Assert.assertFalse(monitor.ligado);
		Assert.assertEquals(50, monitor.brilho);
	}
}
