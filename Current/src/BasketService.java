import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketService implements Basket {

    private final Map<String, Integer> productsStorage = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        productsStorage.put(product, quantity);
        System.out.println("Product " + product + " added");
    }

    @Override
    public void removeProduct(String product) {
        if (productsStorage.isEmpty() || !productsStorage.containsKey(product)) {
            System.out.println("Product " + product + " not found");
            return;
        }
        productsStorage.remove(product);
        System.out.println("Product " + product + " removed");
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (productsStorage.isEmpty() || !productsStorage.containsKey(product)) {
            System.out.println("Product " + product + " not found");
            return;
        }
        productsStorage.put(product, quantity);
        System.out.println("Product " + product + " updated, new quantity is " + quantity);
    }

    @Override
    public void clear() {
        productsStorage.clear();
        System.out.println("Product storage cleaned");
    }

    @Override
    public List<String> getProducts() {
        if (productsStorage.isEmpty()) {
            System.out.println("Product storage is empty");
            return new ArrayList<>();
        }
        return new ArrayList<>(productsStorage.keySet());
    }

    @Override
    public int getProductsQuantity(String product) {
        if (productsStorage.isEmpty() || !productsStorage.containsKey(product)) {
            System.out.println("Product " + product + " not found");
            return -1;
        }
        return productsStorage.get(product);
    }
}
