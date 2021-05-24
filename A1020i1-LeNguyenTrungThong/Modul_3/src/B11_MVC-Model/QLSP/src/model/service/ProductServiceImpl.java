package model.service;

import model.bean.Product;
import model.repository.ProductRepository;
import model.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> showProduct() {
        return this.productRepository.showProduct();
    }

    @Override
    public void newProduct(Product product) {
        productRepository.newProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        this.productRepository.updateProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        this.productRepository.deleteProduct(id);
    }

    @Override
    public void viewProduct(int id) {

    }

    @Override
    public void searchProduct(String name) {

    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public List<Product> searchByKeyword(String keyword) {
        return productRepository.searchByKeyword(keyword);
    }
}
