package ArrayListPractice;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;

    public Product(String name, String price) {
        this.name = name;
        this.price = new BigDecimal(price);
    }
    public String getName() {
        return this.name;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
}
