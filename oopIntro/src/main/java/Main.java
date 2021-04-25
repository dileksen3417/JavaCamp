import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.id = 1L;
        product1.name = "Lenovo V14";
        product1.unitPrice = 7580.0D;
        product1.detail = "16GB Ram 1TB HDD";
        Product product2 = new Product();
        product2.id = 2L;
        product2.name = "HP Pavilion";
        product2.unitPrice = 2500.0D;
        product2.detail = "8GB Ram 1TB HDD";
        Product[] products = new Product[]{product1, product2};
        System.out.println(products.length);
        Product[] var4 = products;
        int var5 = products.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            Product product = var4[var6];
            System.out.println(product.name);
        }

        Category category1 = new Category();
        category1.id = 1L;
        category1.name = "Bahce";
        Category category2 = new Category();
        category2.id = 2L;
        category2.name = "Elektronik";
        List<Category> categoryList = new ArrayList();
        categoryList.add(category1);
        categoryList.add(category2);
        Iterator var13 = categoryList.iterator();

        while (var13.hasNext()) {
            Category category = (Category) var13.next();
            System.out.println(category.name);
        }

        new Product();
        new Product(3L, "Acer", 5550.5D, "acıklama");
        ProductManager productManager = new ProductManager();
        productManager.addToCart();
        productManager.addToCart(product2);
    }
}
