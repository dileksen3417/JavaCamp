package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Abc ile eklendi. " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Abc ile güncellendi. " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Abc ile silindi. " + product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
