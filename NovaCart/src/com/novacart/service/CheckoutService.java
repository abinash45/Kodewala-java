package com.novacart.service;

import com.novacart.exception.OutOfStockException;
import com.novacart.model.Product;

import java.util.Map;

public class CheckoutService {

    public void checkout(CartService cartService)
            throws OutOfStockException {

        Map<Product, Integer> items = cartService.getCartItems();

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {

            if (entry.getValue() > entry.getKey().getStock()) {
                throw new OutOfStockException(
                        "Stock not available for "
                                + entry.getKey().getName());
            }
        }

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {

            Product product = entry.getKey();
            int qty = entry.getValue();

            product.setStock(product.getStock() - qty);
        }

        System.out.println("\n===== FINAL BILL =====");
        cartService.viewCart();

        cartService.clearCart();

        System.out.println("Checkout Successful!");
    }
}