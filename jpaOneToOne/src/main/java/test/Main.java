package test;

import domain.Address;
import domain.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();


        Address address = new Address("İstanbul", "Çekmeköy", "Kuşburnu", "34788");
        Customer customer = new Customer("Dilek", "Şen", new Date(), address);

        entityTransaction.begin();
        entityManager.persist(address);
        entityManager.persist(customer);
        entityTransaction.commit();
    }
}
