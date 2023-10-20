import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister{

    private Set<Product> productSet;

    public ProductRegister(){
        this.productSet = new HashSet<>();

    }

    public void addProduct(long code, String name, double price, int quantity){
        productSet.add(new Product(code, name, price, quantity));
    } 

    public Set<Product> showProductsByName(){
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    public Set<Product> showProductsByPrice(){
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productSet.addAll(productSet);
        return productsByPrice;
    }

    public static void main(String[] args) {
        ProductRegister productRegister = new ProductRegister();

        productRegister.addProduct(1L, "Product 1", 10, 4);
        productRegister.addProduct(4L, "Product 2", 53, 8);
        productRegister.addProduct(1L, "Product 3", 64, 7);
        productRegister.addProduct(1L, "Product 4", 23, 6);

        System.out.println(productRegister.productSet);

        System.out.println(productRegister.showProductsByName());

        System.out.println(productRegister.showProductsByPrice());
    }
}
