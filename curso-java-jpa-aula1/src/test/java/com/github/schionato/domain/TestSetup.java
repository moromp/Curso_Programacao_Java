package com.github.schionato.domain;

import com.github.schionato.infra.EntityManagerFacade;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestSetup {

    private static EntityTransaction open(EntityManager em) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        return transaction;
    }

    private static void close(EntityTransaction transaction) {
        if (transaction.isActive())
            transaction.commit();
    }

    @Before
    public void beforeTest() {
        open(EntityManagerFacade.em());
    }


    @After
    public void afterTest() {
        close(EntityManagerFacade.em().getTransaction());
    }
    
    @Test
    public void ping() throws Exception{
    	
    }
}
