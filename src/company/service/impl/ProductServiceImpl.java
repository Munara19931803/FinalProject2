package company.service.impl;

import company.dao.ProductDao;
import company.model.CompanyName;
import company.model.Product;
import company.service.ProductService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao = new ProductDao();

    @Override
    public void addProducts(List<Product> products) {
        products.stream().
                filter(product -> product.getCompanyName().equals(CompanyName.MILKA) ||

                        product.getCompanyName().equals(CompanyName.NUR) ||

                        product.getCompanyName().equals(CompanyName.TOIBOSS)).

                filter(product -> product.getDiedLine().isAfter(LocalDate.now().minusMonths(1))).

                forEach(productDao.getProducts()::add);

        productDao.getProducts().forEach(System.out::println);

    }

    @Override
    public void sortProducts(List<Product> products) {
        products.stream().
                filter(product -> product.getCompanyName().equals(CompanyName.MILKA) ||

                        product.getCompanyName().equals(CompanyName.NUR) ||

                        product.getCompanyName().equals(CompanyName.TOIBOSS)).
//                filter(product -> product.getDiedLine().minusMonths(1).
//                        plusWeeks(1).isAfter(LocalDate.now())).

               filter(product -> product.getDiedLine().isAfter(LocalDate.now().minusWeeks(1))).

                forEach(productDao.getDiscountProduct()::add);

        products.stream().

                filter(product -> product.getDiedLine().isAfter(LocalDate.now())).

                forEach(productDao.getDiscountProduct()::remove);

        productDao.getDiscountProduct().forEach(System.out::println);
    }


    @Override
    public void getAllProducts() {
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();

        String password = scanner.nextLine();

        if (productDao.getManager().getUserName().equals(login) &&

                productDao.getManager().getUserPassword().equals(password)) {

            System.out.println("ALL PRODUCTS");

            productDao.getProducts().forEach(System.out::println);

            System.out.println("DISCOUNT PRODUCTS: ");

            productDao.getDiscountProduct().forEach(System.out::println);

        }else{
            System.out.println("you have the wrong password!!!");
        }

    }
}

