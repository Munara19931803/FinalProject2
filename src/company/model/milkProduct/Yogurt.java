package company.model.milkProduct;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Yogurt extends Product {
    public Yogurt() {
    }

    public Yogurt(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}
