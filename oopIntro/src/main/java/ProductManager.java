public class ProductManager {
    public void addToCart() {
        System.out.println("Sepete eklendi.");
    }

    public void addToCart(Product product) {
        System.out.println(product.getName() + "\türünü sepete eklendi.");
    }
}
