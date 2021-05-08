import java.util.List;

public class CustomerManager {
    private Logger[] logger;

    //loosly coupled - gevşek bağımlılık
    public CustomerManager(Logger[] logger) {
        this.logger = logger;
    }

    public void add(Customer customer){
        System.out.println("Müşteri eklendi. " + customer.getFirstName());
          //thigtly coupled - sıkı bağımlılık
//        DatabaseLogger databaseLogger = new DatabaseLogger();
//        databaseLogger.log();

        //tek logger kullanımı:
        //logger.log(customer.getFirstName());


//        //Loglama bizim bir aracımız ve bu aracı her işlemde çalıştırmak için her methodun içine bu döngüyü koymamız gerekir.
//        //Bu da prensiplere aykırı olur bunun  için araçlarımızı tutan Utils adında bir class oluştururuz.
        //birden fazla loglama kullanımı
//        for (Logger loggers:logger){
//            loggers.log(customer.getFirstName());
//        }
        Utils.runLoggers(logger, customer.getFirstName());

    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi. " + customer.getFirstName());

//        for (Logger loggers:logger){
//            loggers.log(customer.getFirstName());
//        }

//        Utils utils = new Utils();
//        utils.runLoggers(logger,customer.getFirstName());

        Utils.runLoggers(logger, customer.getFirstName());
    }
}
