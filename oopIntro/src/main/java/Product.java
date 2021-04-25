public class Product {
    long id;
    String name;
    double unitPrice;
    String detail;

    public Product(){
        System.out.println( "empty p");
    }

    public Product(long id, String name, double unitPrice, String detail){
        System.out.println( "not empty p");
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    }

}
