package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    void displayAll();
}
