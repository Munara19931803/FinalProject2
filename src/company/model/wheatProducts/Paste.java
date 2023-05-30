package company.model.wheatProducts;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Paste extends Product {
    public Paste() {
    }

    public Paste(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}
