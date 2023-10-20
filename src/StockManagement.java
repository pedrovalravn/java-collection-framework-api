import java.util.HashMap;
import java.util.Map;

public class StockManagement {
    private Map<Long, StockProducts> stockProductsMap;

    public StockManagement() {
        this.stockProductsMap = new HashMap<>();
    }

    public void addProduct(long cod, String name, int quantity, double price) {
        stockProductsMap.put(cod, new StockProducts(name, price, quantity));
    }

    public void showProduct() {
        System.out.println(stockProductsMap);
    }

    public double calculateTotalStockValue() {
        double stockTotalValue = 0d;
        if (!stockProductsMap.isEmpty()) {
            for (StockProducts p : stockProductsMap.values()) {
                stockTotalValue += p.getQuantity() * p.getPrice();
            }
        }
        return stockTotalValue;
    }

    public StockProducts getExpensiveProduct() {
        StockProducts expensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;
        if (!stockProductsMap.isEmpty()) {
            for (StockProducts p : stockProductsMap.values()) {
                if (p.getPrice() > highestPrice) {
                    expensiveProduct = p;
                    highestPrice = p.getPrice();
                }
            }
        }
        return expensiveProduct;
    }

    public static void main(String[] args) {
        StockManagement stock = new StockManagement();
        stock.showProduct();

        stock.addProduct(1L, "Product A", 30, 5.6);
        stock.addProduct(2L, "Product B", 23, 42.0);
        stock.addProduct(3L, "Product C", 5, 23.0);
        stock.addProduct(4L, "Product D", 7, 4.0);
        stock.addProduct(5L, "Product E", 2, 2.0);

        stock.showProduct();

        System.out.println("Total stock value is: $" + stock.calculateTotalStockValue());
        
        StockProducts expensiveProduct = stock.getExpensiveProduct();
        if (expensiveProduct != null) {
            System.out.println("The most expensive product is: " + expensiveProduct.getName() + " with a price of $" + expensiveProduct.getPrice());
        } else {
            System.out.println("No products in stock.");
        }
    }
}