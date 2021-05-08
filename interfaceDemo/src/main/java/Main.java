import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"dilek","şen");

        Logger[] loggerList = new Logger[]{new DatabaseLogger(), new SmsLogger()};

        CustomerManager customerManager = new CustomerManager(loggerList);
        customerManager.add(customer);
        customerManager.delete(customer);
    }
}
