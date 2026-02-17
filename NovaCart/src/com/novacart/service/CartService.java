package com.novacart.service;

import com.novacart.exception.OutOfStockException;
import com.novacart.model.Product;

import java.util.HashMap;
import java.util.Map;

public class CartService {

    private Map<Product, Integer> cart = new HashMap<>();

    public void addToCart(Product product, int quantity)
            throws OutOfStockException {

        if (quantity > product.getStock()) {
            throw new OutOfStockException("Insufficient stock!");
        }

        int existingQty = 0;

        if (cart.containsKey(product)) {
            existingQty = cart.get(product);
        }

        cart.put(product, existingQty + quantity);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void viewCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {

            Product product = entry.getKey();
            int qty = entry.getValue();

            double subtotal = product.getPrice() * qty;
            total += subtotal;

            System.out.println(product.getName()
                    + " | Qty: " + qty
                    + " | Subtotal: ₹" + subtotal);
        }

        System.out.println("Total: ₹" + total);
    }

    public Map<Product, Integer> getCartItems() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}