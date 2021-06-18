import domain.Contact;
import domain.Personel;
import domain.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
     public static void main(String[]args){
          /*persistence.xml dosyamızda persistence-unit adında bir property açıp kullanmak istediğimiz
           *veritabanının bilgilerini vermiştik. Bu veritabanından bir fabrika açıyoruz.
           */
          EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
          EntityManager entityManager = factory.createEntityManager();

          /*
           * Transaction: açtığımız sorgularda queryler sırasında bişeyler ters gidersetüm değişiklikleri geri alması için
           * transaction yöntemiyle rollback yaparız.
           */
          EntityTransaction entityTransaction = entityManager.getTransaction();

          //addPersonnel(entityManager, entityTransaction);

          //findPersonnel(entityManager);

          //updatePersonnel(entityManager, entityTransaction);

          //deletePersonnel(entityManager, entityTransaction);

          /* embedded class test: */

          User user = new User("Dilek", "123456", new Contact("05555", "dsen", "dsen.com"),new Date() );


     }

     private static void deletePersonnel(EntityManager entityManager, EntityTransaction entityTransaction) {
          Personel personel = entityManager.find(Personel.class, 1);
          entityTransaction.begin();
          entityManager.remove(personel);
          entityTransaction.commit();
     }

     private static void updatePersonnel(EntityManager entityManager, EntityTransaction entityTransaction) {
    /*
       önce güncellemek istedigimiz datayı dbden cekmeli, güncelleyipmerge etmeliyiz.
     */
          Personel personel = entityManager.find(Personel.class, 2);
          entityTransaction.begin();
          personel.setFirstName("Canım esim Altug");
          entityManager.merge(personel);
          entityTransaction.commit();
     }

     private static void findPersonnel(EntityManager entityManager) {
          /*veritabanından nesne bulma getirme : FIND
          *hataya neden olacak bişey olmadığı için transaction acmama gerek yok
          */

          /*bunun için EM'ın find methodunu kullanacagım ve bu T tipinde bir nesne istiyor
           *T olacak entity'nin class bilgisini benden istiyoru dönecek değer Personel.class olugunu biliyorum
           * T olarak bunu veriyorum, gelecek olan datayı da yeni yarattıgım Personel nesnesi ile almam gerekiyor
           * 2 ise tablonun primary key olan alanındaki hangi değeri bulmak istedigim, yani 2 idli elemanı getirsin
           */

          Personel personel = entityManager.find(Personel.class, 2);
          //nullpointer hatası yememek için dbden gelen her datayı kontrol etmeliyiz
          if(personel != null){
               System.out.println("Personel bilgisi:" + personel.getFirstName() + personel.getLastName());
          } else {
               System.out.println("Personel bulunamadı.");
          }
     }

     private static void addPersonnel(EntityManager entityManager, EntityTransaction entityTransaction) {
          //personel ekleme
          Personel personel = new Personel(1,"Dilek","Şen",new Date(),"0110122300");

          Personel personel2 = new Personel(2,"Altuğ","Atmaca",new Date(),"0110126255");

          entityTransaction.begin();
          entityManager.persist(personel2);
          entityTransaction.commit();
     }
}
