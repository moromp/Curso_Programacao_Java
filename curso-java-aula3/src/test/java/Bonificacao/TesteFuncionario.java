package Bonificacao;

import org.junit.Assert;
import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void testarSalario(){
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Mateus");
		funcionario.setCargo("Analista");
		funcionario.setSalario(1000.0);
		Assert.assertEquals(Double.valueOf(1000),Double.valueOf(funcionario.getSalario()));
	}
	
	@Test
	public void testarBonificacao(){
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Mateus");
		funcionario.setCargo("Analista");
		funcionario.setSalario(100.0);
		funcionario.setPorcentagemBonificacao(100);
		Assert.assertEquals(Double.valueOf(200),Double.valueOf(funcionario.getSalarioComBonificacao()));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testarSalarioMenor(){
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Mateus");
		funcionario.setCargo("Analista");
		funcionario.setSalario(1000.0);
		funcionario.setSalario(100.0);
	}
	
	@Test
	public void testarSalarioMenor2(){
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Mateus");
		funcionario.setCargo("Analista");
		funcionario.setSalario(1000.0);
		funcionario.setSalario(100.0);
	}

}
