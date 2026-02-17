package com.cartzy.controller;

import java.util.List;
import java.util.Optional;

import com.cartzy.entity.Product;
import com.cartzy.exception.OutOfStockException;
import com.cartzy.service.CartService;
import com.cartzy.service.ProductService;

public class CartController {

    private ProductService productService;
    private CartService cartService;

    // Constructor
    public CartController() {
        this.productService = new ProductService();
        this.cartService = new CartService();
    }

    // 1. View all products
    public void viewAllProducts() {
        productService.displayProducts();
    }

    // 2. Search product
    public void searchProduct(String name) {
        List<Product> results = productService.searchProductByName(name);

        if (results.isEmpty()) {
            System.out.println("No product found with name: " + name);
        } else {
            for (Product p : results) {
                System.out.println(
                        p.getId() + " | " +
                        p.getName() + " | " +
                        p.getPrice() + " | " +
                        p.getStock()
                );
            }
        }
    }

    // 3. Sort products
    public void sortProducts(int order) {
        if (order == 1) {
            productService.valueByAscending();
        } else {
            productService.valueByDescingOrder();
        }
        productService.displayProducts();
    }

    // 4. Add to cart
    public void addToCart(int productId, int quantity) {
        Optional<Product> product = productService.getProductById(productId);

        if (product.isEmpty()) {
            System.out.println("Product not found.");
            return;
        }

        try {
            cartService.addCart(product.get(), quantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }

    // 5. Remove from cart
    public void removeFromCart(int productId) {
        Optional<Product> product = productService.getProductById(productId);

        if (product.isEmpty()) {
            System.out.println("Product not found.");
            return;
        }

        cartService.removeFromCart(product.get());
    }

    // 6. Update cart quantity
    public void updateCartQuantity(int productId, int quantity) {
        Optional<Product> product = productService.getProductById(productId);

        if (product.isEmpty()) {
            System.out.println("Product not found.");
            return;
        }

        try {
            cartService.updateQuatity(product.get(), quantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }

    // 7. View cart
    public void viewCart() {
        cartService.viewCart();
    }

    // 8. Checkout
    public void checkout() {
        try {
            cartService.checkOut();
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}