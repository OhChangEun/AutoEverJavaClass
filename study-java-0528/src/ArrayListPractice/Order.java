package ArrayListPractice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Order {
    ArrayList<Product> products;
    BigDecimal total;

    public Order() {
        products = new ArrayList<Product>();
        total = BigDecimal.ZERO;
    }
    public void addItem(Product product) {
        products.add(product);
        this.total = this.total.add(product.price);
    }
    public Product getItem(String name) {
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getName().equals(name))
                return products.get(i);
        }
        return null;
    }
    public boolean removeItem(String name) {
        for (int i=0; i<products.size(); i++) {
            Product p = products.get(i);
            if (p.getName().equals(name)) {
                this.products.remove(p);
                this.total = this.total.subtract(p.getPrice());
                return true;
            }
        }
        return false;
    }
    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {
        BigDecimal result = this.total.add(this.total.multiply(taxRate));
        BigDecimal scaledRes = result.setScale(2, RoundingMode.HALF_UP);
        return scaledRes;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
}
