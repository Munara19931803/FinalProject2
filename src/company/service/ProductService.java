package company.service;

import company.model.Product;

import java.util.List;

public interface ProductService {
    void addProducts(List<Product>products);
    void sortProducts(List<Product>products);
    void getAllProducts();
}
