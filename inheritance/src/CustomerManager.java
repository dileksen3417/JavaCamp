public class CustomerManager {

    public void add(Customer customer){
        System.out.println(customer.customerNumber+"\tkaydedildi.");
    }

    //bulk insert(toplu müşteri ekleme operasyonu yazılması isteniyor,50+corporate&150+Indivual ornegin)
    public void addMultiple(Customer[] customers){
        for (Customer customer:customers) {
            add(customer);
        }
    }

}
