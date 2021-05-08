import business.abstracts.ProductService;
import business.concretes.ProductServiceImpl;
import core.concretes.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {
    public static void main(String[] args){
        //ToDo: Spring IoC ile çözülecek
        ProductService productService = new ProductServiceImpl(new HibernateProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1, 1, "Elma", 8.99, 150);
        productService.add(product);

        Product product1 = new Product(1, 2, "Elma", 8.99, 150);
        productService.add(product1);
    }
}
