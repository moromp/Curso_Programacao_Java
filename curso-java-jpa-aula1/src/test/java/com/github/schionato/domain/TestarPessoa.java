package com.github.schionato.domain;

import java.util.Date;

import org.junit.Test;

import com.github.schionato.infra.EntityManagerFacade;

import cafeteria.cliente;
import cafeteria.sexo;

public class TestarPessoa extends TestSetup{
	
	@Test
    public void Testar() throws Exception{
    	cliente cliente = new cliente("mateus",new Date(),29,sexo.MASCULINO,1500d);
    	
    	EntityManagerFacade.em().persist(cliente);//salvando no banco
    }
}
