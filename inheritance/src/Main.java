public class Main {
     public static void main(String[]args){
          IndividualCustomer individualCustomer = new IndividualCustomer();
          individualCustomer.customerNumber="010011";

          CorporateCustomer corporateCustomerHB = new CorporateCustomer();
          corporateCustomerHB.customerNumber="hpsb001";

          CorporateCustomer corporateCustomerTY = new CorporateCustomer();
          corporateCustomerTY.customerNumber="trndyl35";

          CustomerManager customerManager= new CustomerManager();
          customerManager.add(individualCustomer);
          customerManager.add(corporateCustomerHB);

          Customer[] customers = {individualCustomer, corporateCustomerHB, corporateCustomerTY};
          customerManager.addMultiple(customers);


     }
}
