package company.model.meatProduct;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Meat extends Product {
    public Meat() {
    }

    public Meat(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}
