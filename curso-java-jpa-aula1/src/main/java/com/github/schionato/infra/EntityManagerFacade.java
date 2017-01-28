package com.github.schionato.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFacade {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("cafeteria");

    private static abstract class LocalEntityManager extends ThreadLocal<EntityManager> {
        @Override
        public void remove() {
            EntityManager em = this.get();
            if (em != null && em.isOpen()) {
                em.close();
            }
            super.remove();
        }
    }


    private static final LocalEntityManager EM = new LocalEntityManager() {
        @Override
        protected EntityManager initialValue() {
            return factory.createEntityManager();
        }
    };

    public static EntityManager em() {
        return EM.get();
    }
}
