import java.util.Comparator;

public class Product implements Comparable<Product>{
    
    private long code;
    private String name;
    private double price;
    private int quantity;

    public Product(long code, String name, double price, int quantity) { 
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product p){
        return name.compareToIgnoreCase(p.getName());
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getCode() == product.getCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

class ComparatorByPrice implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2){
        return Double.compare(p1.getPrice(), p2.getPrice());
    }

}
