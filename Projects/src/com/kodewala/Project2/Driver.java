package com.kodewala.Project2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD DELIVERY SYSTEM =====");
        System.out.println("1. Normal Order");
        System.out.println("2. Express Order");
        System.out.println("3. Scheduled Order");
        System.out.print("Choose order type: ");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();

        System.out.print("Enter Restaurant Name: ");
        String restaurantName = sc.nextLine();

        System.out.print("Enter Order Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                Order normalOrder = new Order(orderId, restaurantName, amount);
                System.out.println("\n--- Normal Order Details ---");
                normalOrder.showOrderDetails();
                System.out.println("Final Amount: ₹" +
                        normalOrder.calculateFinalAmount());
                break;

            case 2:
                ExpressOrder expressOrder =
                        new ExpressOrder(orderId, restaurantName, amount);
                System.out.println("\n--- Express Order Details ---");
                expressOrder.showExpressDetails();
                break;

            case 3:
                System.out.print("Enter Delivery Date & Time: ");
                String dateTime = sc.nextLine();

                ScheduleOrder scheduledOrder =
                        new ScheduleOrder(orderId, restaurantName, amount, dateTime);
                System.out.println("\n--- Scheduled Order Details ---");
                scheduledOrder.showScheduledDetails();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("\nTotal Orders Created: " + Order.totalOrders);
        sc.close();
    }
}
