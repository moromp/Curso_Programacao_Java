package equipamentos;

import junit.framework.Assert;

import org.junit.Test;

public class testarEquipametos {

	@Test
	public void TestarImpressora(){
		double preco = 200;
		Impressora impressora = new Impressora(preco,"HP");
		Assert.assertEquals(Double.valueOf(preco),Double.valueOf(impressora.calcularPrecoFinal()));
	}
	
	@Test
	public void TestarTelevisao(){
		double preco = 200;
		Televisao televisao  = new Televisao(preco,"Samsung",10);
		Assert.assertEquals(Double.valueOf(preco),Double.valueOf(televisao.calcularPrecoFinal()));
	}
	
	@Test
	public void TestarCadeira(){
		double preco = 200;
		Cadeira cadeira = new Cadeira(preco,"Marmoraria");
		Assert.assertEquals(Double.valueOf(preco),Double.valueOf(cadeira.calcularPrecoFinal()));
	}
	
	
}
