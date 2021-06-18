package test;

import domain.Address;
import domain.Personel;
import domain.util.BodyInfoType;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Personel personel = new Personel("Dilek", "Şen", new Date());
        personel.getPersonelNumber().add("5326985522");
        Personel personel2 = new Personel("Altuğ", "Şen", new Date());
        personel2.addPhoneNumber("5326985522");
        personel2.getAddressList().add(new Address("İstanbul", "Çekmeköy", "Kusburnu", 34788));
        personel2.addBodySize("L", "Beden");
        personel2.addBodySize("44", "Ayakkabı");
        personel2.getBodySize().put("50", "Beden");
        personel2.getBodyInfo().put(BodyInfoType.WEIGHT, "83");
        personel2.addBodyInfo(BodyInfoType.HEIGHT, "185");
        personel2.getEmails().add("dsen@gmail.com");
        entityTransaction.begin();
        entityManager.persist(personel2);
        entityTransaction.commit();
    }
}