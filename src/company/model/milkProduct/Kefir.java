package company.model.milkProduct;

import company.model.CompanyName;
import company.model.Product;

import java.time.LocalDate;

public class Kefir extends Product {
    public Kefir() {
    }

    public Kefir(int id, String name, CompanyName companyName, LocalDate diedLine) {
        super(id, name, companyName, diedLine);
    }
}
