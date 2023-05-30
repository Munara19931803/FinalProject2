package company.dao;

import company.model.Manager;
import company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products = new ArrayList<>();
    private List<Product> discountProduct = new ArrayList<>();
    private Manager manager= new Manager("product","product1");

    public ProductDao() {
    }

    public ProductDao(List<Product> products, List<Product> discountProduct, Manager manager) {
        this.products = products;
        this.discountProduct = discountProduct;
        this.manager = manager;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscountProduct() {
        return discountProduct;
    }

    public void setDiscountProduct(List<Product> discountProduct) {
        this.discountProduct = discountProduct;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "products=" + products +
                ", discountProduct=" + discountProduct +
                ", manager=" + manager +
                '}';
    }
}

