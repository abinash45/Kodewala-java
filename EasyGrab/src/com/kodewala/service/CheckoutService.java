package com.kodewala.easygrab.service;

import com.kodewala.easygrab.exception.OutOfStockException;
import com.kodewala.easygrab.model.Product;

import java.util.Map;

public class CheckoutService {

    public void checkout(CartService cartService)
            throws OutOfStockException {

        Map<Product, Integer> items =
                cartService.getCartItems();

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        // Validate stock
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            if (entry.getValue() >
                    entry.getKey().getStock()) {

                throw new OutOfStockException(
                        "Stock not available for "
                                + entry.getKey().getName());
            }
        }

        // Reduce stock
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product p = entry.getKey();
            p.setStock(p.getStock() - entry.getValue());
        }

        System.out.println("===== FINAL BILL =====");
        cartService.viewCart();

        cartService.clearCart();
        System.out.println("Checkout Successful!");
    }
}