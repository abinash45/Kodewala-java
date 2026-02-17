package com.kodewala.easygrab.service;

import com.kodewala.easygrab.exception.OutOfStockException;
import com.kodewala.easygrab.model.Product;

import java.util.HashMap;
import java.util.Map;

public class CartService {

    private Map<Product, Integer> cart = new HashMap<>();

    public void addToCart(Product product, int quantity)
            throws OutOfStockException {

        if (quantity > product.getStock()) {
            throw new OutOfStockException("Insufficient stock!");
        }

        cart.put(product,
                cart.getOrDefault(product, 0) + quantity);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void viewCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        cart.forEach((product, qty) -> {
            double subtotal = product.getPrice() * qty;
            System.out.println(product.getName()
                    + " | Qty: " + qty
                    + " | Subtotal: ₹" + subtotal);
        });

        System.out.println("Total: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        return cart.entrySet().stream()
                .mapToDouble(e ->
                        e.getKey().getPrice() * e.getValue())
                .sum();
    }

    public Map<Product, Integer> getCartItems() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}