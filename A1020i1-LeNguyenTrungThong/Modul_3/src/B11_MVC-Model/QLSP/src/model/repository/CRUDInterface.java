package model.repository;

import model.bean.Product;

import java.util.List;

public interface CRUDInterface {
    List<Product> showProduct();
    void newProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    void viewProduct(int id);
    void searchProduct(String name);
    Product findById(int id);
}
