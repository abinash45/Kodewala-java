package com.kodewala.easygrab.service;

import com.kodewala.easygrab.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {

        boolean exists = products.stream()
                .anyMatch(p -> p.getId() == product.getId());

        if (exists) {
            System.out.println("Duplicate Product ID not allowed!");
            return;
        }

        products.add(product);
    }

    public void displayProducts() {
        products.forEach(System.out::println);
    }

    public List<Product> searchByName(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase()
                        .contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByPriceAsc() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortByPriceDesc() {
        products.sort(
                Comparator.comparing(Product::getPrice).reversed());
    }

    public Optional<Product> getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }
}