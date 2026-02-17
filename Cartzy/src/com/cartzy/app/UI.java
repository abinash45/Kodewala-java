package com.cartzy.app;

import java.util.Scanner;
import com.cartzy.controller.CartController;

public class UI {

    public static void UILauncher() {

        Scanner sc = new Scanner(System.in);
        CartController controller = new CartController();

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- Welcome to Cartzy ---");
            System.out.println("1. View all products");
            System.out.println("2. Search product by name");
            System.out.println("3. Sort products by price");
            System.out.println("4. Add product to cart");
            System.out.println("5. Remove product from cart");
            System.out.println("6. Update quantity in cart");
            System.out.println("7. View cart");
            System.out.println("8. Checkout");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    controller.viewAllProducts();
                    break;

                case 2:
                    System.out.print("Enter product name to search: ");
                    String name = sc.nextLine();
                    controller.searchProduct(name);
                    break;

                case 3:
                    System.out.print("Sort by price (1=ascending, 2=descending): ");
                    int order = sc.nextInt();
                    controller.sortProducts(order);
                    break;

                case 4:
                    System.out.print("Enter product ID to add: ");
                    int addId = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int addQty = sc.nextInt();
                    controller.addToCart(addId, addQty);
                    break;

                case 5:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = sc.nextInt();
                    controller.removeFromCart(removeId);
                    break;

                case 6:
                    System.out.print("Enter product ID to update quantity: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new quantity: ");
                    int updateQty = sc.nextInt();
                    controller.updateCartQuantity(updateId, updateQty);
                    break;

                case 7:
                    controller.viewCart();
                    break;

                case 8:
                    controller.checkout();
                    break;

                case 9:
                    System.out.println("Thank you for using Cartzy. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}