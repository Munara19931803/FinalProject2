import company.model.CompanyName;
import company.model.Product;
import company.model.meatProduct.Fish;
import company.model.meatProduct.Meat;
import company.model.meatProduct.Sausage;
import company.model.milkProduct.Kefir;
import company.model.milkProduct.Milk;
import company.model.milkProduct.Yogurt;
import company.model.wheatProducts.Bread;
import company.model.wheatProducts.Flour;
import company.model.wheatProducts.Paste;
import company.service.impl.ProductServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish(1, "Kit", CompanyName.TOIBOSS,
                LocalDate.of(2023, 4, 30));

        Meat meat = new Meat(2, "chicken", CompanyName.TOIBOSS,
                LocalDate.of(2023, 4, 20));

        Sausage sausage = new Sausage(3, "halal", CompanyName.TOIBOSS,
                LocalDate.of(2023, 5, 30));

        Kefir kefir = new Kefir(4, "Chudo", CompanyName.MILKA,
                LocalDate.of(2023, 5, 30));

        Milk milk = new Milk(5, "NeChudo", CompanyName.MILKA,
                LocalDate.of(2023, 5, 21));

        Yogurt yogurt = new Yogurt(6, "Chudo", CompanyName.MILKA,
                LocalDate.of(2023, 5, 30));

        Bread bread = new Bread(7, "Chudo", CompanyName.NUR,
                LocalDate.of(2023, 5, 20));

        Flour flour = new Flour(8, "Chudo", CompanyName.NUR,
                LocalDate.of(2023, 5, 30));

        Paste paste = new Paste(9, "Chudo", CompanyName.IDEAL,
                LocalDate.of(2023, 5, 30));

        List<Product> list = new ArrayList<>(Arrays.asList(fish, meat, paste, flour, bread, yogurt, milk, kefir, sausage));

        ProductServiceImpl productService = new ProductServiceImpl();

        System.out.println("METHOD ADDPRODUCTS: " );

        productService.addProducts(list);

        System.out.println("METHOD SORTPRODUCTS:  ");

           productService.sortProducts(list);


        productService.getAllProducts();

    }
}