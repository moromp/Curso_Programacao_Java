package FolhaPagamento;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import folhapagamento.FolhaPagamento;
import folhapagamento.Gerente;
import folhapagamento.Secretária;
import folhapagamento.Supervisor;

public class TesteFolhaPagamento {

	private FolhaPagamento folhapagamento;
	
	@Before
	public void init(){
		folhapagamento = new FolhaPagamento();
	}
	
	@Test
	public void TesteGerente(){
		Gerente gerente = new Gerente("Marcio",100);
		Assert.assertEquals(Double.valueOf(115),Double.valueOf(gerente.getSalarioComBonificacao()));
	}
	
	@Test
	public void TesteSupervisor(){
		Supervisor supervisor = new Supervisor("Mateus",100);
		Assert.assertEquals(Double.valueOf(110),Double.valueOf(supervisor.getSalarioComBonificacao()));
	}
	
	@Test
	public void TesteSecretaria(){
		Secretária secretaria = new Secretária("Anderson",100);
		Assert.assertEquals(Double.valueOf(100),Double.valueOf(secretaria.getSalarioComBonificacao()));
	}
	
	@Test
	public void TestarSemFuncionarios(){
		double total = folhapagamento.calcular();
		Assert.assertEquals(Double.valueOf(0),Double.valueOf(total));
	}
	
	@Test
	public void TestarCalculoFolha(){
		Gerente gerente = new Gerente("Marcio",100);
		Supervisor supervisor = new Supervisor("Mateus",100);
		Secretária secretaria = new Secretária("Anderson",100);
		
		double total = folhapagamento.calcular(gerente,supervisor,secretaria);
		Assert.assertEquals(Double.valueOf(115+110+100),Double.valueOf(total));
	}
}
