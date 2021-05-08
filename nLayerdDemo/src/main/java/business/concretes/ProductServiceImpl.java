package business.concretes;

import business.abstracts.ProductService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductServiceImpl(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return; //bunu gördüğü an aşağı kodlara gitmesin demek yani exception fırlatmak gibi asağıya hiç bakmasın
        }
        productDao.add(product);
        loggerService.logToSystem(product.getName() + " ürünü eklendi.");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
