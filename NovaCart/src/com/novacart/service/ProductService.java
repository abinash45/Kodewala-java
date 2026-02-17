package com.novacart.service;

import com.novacart.model.Product;

import java.util.*;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {

        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("Duplicate Product ID not allowed!");
                return;
            }
        }

        products.add(product);
    }

    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public List<Product> searchByName(String name) {

        List<Product> result = new ArrayList<>();

        for (Product p : products) {
            if (p.getName().toLowerCase()
                    .contains(name.toLowerCase())) {
                result.add(p);
            }
        }

        return result;
    }

    public void sortByPriceAsc() {

        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
    }

    public void sortByPriceDesc() {

        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });
    }

    public Optional<Product> getProductById(int id) {

        for (Product p : products) {
            if (p.getId() == id) {
                return Optional.of(p);
            }
        }

        return Optional.empty();
    }
}