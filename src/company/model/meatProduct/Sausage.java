package company.model.meatProduct;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Sausage extends Product {
    public Sausage() {
    }

    public Sausage(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}