public class Product {
    private long id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product() {
    }

    public Product(long id, String name, double unitPrice, String detail, double discount) {
        System.out.println("not empty p");
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * this.discount / 100);
    }

    public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

}
