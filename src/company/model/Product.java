package company.model;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Product {
    private int id;
    private  String name;
    private  CompanyName companyName;
    private LocalDate diedLine;

    public Product() {
    }

    public Product(int id, String name, CompanyName companyName, LocalDate diedLine) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.diedLine = diedLine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDiedLine() {
        return diedLine;
    }

    public void setDiedLine(LocalDate diedLine) {
        this.diedLine = diedLine;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyName=" + companyName +
                ", diedLine=" + diedLine +
                '}';
    }
}
