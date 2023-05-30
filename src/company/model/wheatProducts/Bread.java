package company.model.wheatProducts;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Bread extends Product {
    public Bread() {
    }

    public Bread(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}
