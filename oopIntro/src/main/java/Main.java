import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        createDataOldVersion();
    }

    private static void createDataOldVersion() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Lenovo V14");
        product1.setDetail("16GB Ram 1TB HDD");
        product1.setUnitPrice(7580.0D);

        Product product2 = new Product(2, "HP Pavilion", 2500.0D, "8GB Ram 1TB HDD", 13);

        Product[] products = new Product[]{product1, product2};
        System.out.println(products.length);

        for (int i = 0; i < products.length; ++i) {
            Product product = products[i];
            System.out.println(product.getName());
        }

        Category category1 = new Category(1, "Bahçe");
//        category1.id = 1L;
//        category1.name = "Bahce";
        Category category2 = new Category(2, "Elektronik");
//        category2.id = 2;
//        category2.name = "Elektronik";
        List<Category> categoryList = new ArrayList();
        categoryList.add(category1);
        categoryList.add(category2);
        Iterator var13 = categoryList.iterator();

        while (var13.hasNext()) {
            Category category = (Category) var13.next();
            System.out.println(category.getName());
        }

        new Product();
        new Product(3L, "Acer", 5550.5D, "acıklama", 5000);
        ProductManager productManager = new ProductManager();
        productManager.addToCart();
        productManager.addToCart(product2);
    }
}
