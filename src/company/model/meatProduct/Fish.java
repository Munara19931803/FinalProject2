package company.model.meatProduct;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Fish extends Product {
    public Fish() {
    }

    public Fish(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name,  companyName, diedLine);
    }
}
