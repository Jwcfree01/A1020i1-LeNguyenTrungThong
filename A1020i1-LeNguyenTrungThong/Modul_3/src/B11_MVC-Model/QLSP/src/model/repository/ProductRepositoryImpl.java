package model.repository;

import model.bean.Product;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productMap = new TreeMap<>();

    static {
        productMap.put(1,  new Product(1, "iphone1", 10000));
        productMap.put(2,  new Product(2, "iphone2", 11000));
        productMap.put(3,  new Product(3, "iphone3", 12000));
        productMap.put(4,  new Product(4, "iphone4", 13000));
        productMap.put(5,  new Product(5, "iphone5", 14000));
    }

    @Override
    public List<Product> showProduct() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void newProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void updateProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(int id) {
        productMap.remove(id);
    }

    @Override
    public void viewProduct(int id) {
        productMap.get(id);
    }

    @Override
    public void searchProduct(String name) {

        productMap.get(name);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> searchByKeyword(String keyword) {
        return productMap.values().stream().filter(cus -> cus.getName().toLowerCase()
                .contains(keyword.toLowerCase())).collect(Collectors.toList());
    }
}
