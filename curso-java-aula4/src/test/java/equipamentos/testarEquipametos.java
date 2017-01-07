package equipamentos;



import org.junit.Assert;
import org.junit.Test;

public class testarEquipametos {

	@Test
	public void TestarImpressora(){
		double preco = 200;
		Impressora impressora = new Impressora(preco,"HP");
		Assert.assertEquals(Double.valueOf(210),Double.valueOf(impressora.calcularPrecoFinal()));
		//fiz o calcularPrecoFinal com substituição, esta na classe Impressora
	}
	
	@Test
	public void TestarTelevisao(){
		double preco = 100;
		Televisao televisao  = new Televisao(preco,"Samsung",10);
		Assert.assertEquals(Double.valueOf(102),Double.valueOf(televisao.calcularPrecoFinal(2)));
		//fiz o calcularPrecoFinal com sobrecarga, esta na classe Equipamento 
	}
	
	@Test
	public void TestarCadeira(){
		double preco = 200;
		Cadeira cadeira = new Cadeira(preco,"Marmoraria");
		Assert.assertEquals(Double.valueOf(preco),Double.valueOf(cadeira.calcularPrecoFinal()));
	}
	
	
}
