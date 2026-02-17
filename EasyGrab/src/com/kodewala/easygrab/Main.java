package com.kodewala.easygrab;

import com.kodewala.easygrab.data.SampleData;
import com.kodewala.easygrab.exception.OutOfStockException;
import com.kodewala.easygrab.model.Product;
import com.kodewala.easygrab.service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductService productService = new ProductService();
        CartService cartService = new CartService();
        CheckoutService checkoutService = new CheckoutService();

        // Load products
        SampleData.loadProducts(productService);

        int choice;

        do {
            System.out.println("\n===== EASYGRAB MENU =====");
            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Sort Price Low-High");
            System.out.println("4. Sort Price High-Low");
            System.out.println("5. Add to Cart");
            System.out.println("6. Remove from Cart");
            System.out.println("7. View Cart");
            System.out.println("8. Checkout");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    productService.displayProducts();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    productService.searchByName(name)
                            .forEach(System.out::println);
                    break;

                case 3:
                    productService.sortByPriceAsc();
                    System.out.println("Sorted Low → High");
                    break;

                case 4:
                    productService.sortByPriceDesc();
                    System.out.println("Sorted High → Low");
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    productService.getProductById(id)
                            .ifPresent(product -> {
                                try {
                                    cartService.addToCart(product, qty);
                                    System.out.println("Added to cart.");
                                } catch (OutOfStockException e) {
                                    System.out.println(e.getMessage());
                                }
                            });
                    break;

                case 6:
                    System.out.print("Enter Product ID: ");
                    int removeId = sc.nextInt();
                    productService.getProductById(removeId)
                            .ifPresent(cartService::removeFromCart);
                    System.out.println("Removed from cart.");
                    break;

                case 7:
                    cartService.viewCart();
                    break;

                case 8:
                    try {
                        checkoutService.checkout(cartService);
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

        } while (choice != 9);

        System.out.println("Thank you for using EasyGrab!");
    }
}