package com.mycompany.objectdb;



public class Main {
    public static void main(String[] args) {
        // Crea un EntityManagerFactory usando la unidad de persistencia definida en persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb-example");
        EntityManager em = emf.createEntityManager();

        // Crea una nueva entidad Persona
        Persona persona = new Persona(1L, "Juan Pérez", 30);

        // Inicia una transacción, persiste la entidad y cierra la transacción
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();

        // Cierra el EntityManager y el EntityManagerFactory
        em.close();
        emf.close();
        
        System.out.println("Persona guardada exitosamente!");
    }
}

