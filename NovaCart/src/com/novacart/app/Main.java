package com.novacart.app;

import com.novacart.data.SampleData;
import com.novacart.exception.OutOfStockException;
import com.novacart.model.Product;
import com.novacart.service.CartService;
import com.novacart.service.CheckoutService;
import com.novacart.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ProductService productService = new ProductService();
		CartService cartService = new CartService();
		CheckoutService checkoutService = new CheckoutService();

		SampleData.loadProducts(productService);

		int choice;

		do {

			// Clear separation
			System.out.println("\n==================================");
			System.out.println("          NOVACART MENU           ");
			System.out.println("==================================");
			System.out.println("1. View Products");
			System.out.println("2. Search Product");
			System.out.println("3. Sort Price Low to High");
			System.out.println("4. Sort Price High to Low");
			System.out.println("5. Add to Cart");
			System.out.println("6. Remove from Cart");
			System.out.println("7. View Cart");
			System.out.println("8. Checkout");
			System.out.println("9. Exit");
			System.out.print("Enter choice: ");

			choice = scanner.nextInt();
			System.out.println("\n----------------------------------");

			switch (choice) {

			case 1:
				System.out.println("You selected: View Products\n");
				productService.displayProducts();
				break;

			case 2:
				scanner.nextLine();
				System.out.println("You selected: Search Product");
				System.out.print("Enter product name: ");
				String name = scanner.nextLine();

				List<Product> results = productService.searchByName(name);

				if (results.isEmpty()) {
					System.out.println("Product not found.");
				} else {
					for (com.novacart.model.Product product : results) {
						System.out.println(product);
					}
				}
				break;
			case 3:
				System.out.println("You selected: Sort Price Low to High\n");
				productService.sortByPriceAsc();
				productService.displayProducts();
				break;

			case 4:
				System.out.println("You selected: Sort Price High to Low\n");
				productService.sortByPriceDesc();
				productService.displayProducts();
				break;

			case 5:
				System.out.println("You selected: Add to Cart");
				System.out.print("Enter Product ID: ");
				int id = scanner.nextInt();
				System.out.print("Enter Quantity: ");
				int quantity = scanner.nextInt();

				productService.getProductById(id).ifPresent(product -> {
					try {
						cartService.addToCart(product, quantity);
						System.out.println("Product added to cart successfully.");
					} catch (OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				});
				break;

			case 6:
				System.out.println("You selected: Remove from Cart");
				System.out.print("Enter Product ID: ");
				int removeId = scanner.nextInt();
				productService.getProductById(removeId).ifPresent(product -> {
					cartService.removeFromCart(product);
					System.out.println("Product removed from cart.");
				});
				break;

			case 7:
				System.out.println("You selected: View Cart\n");
				cartService.viewCart();
				break;

			case 8:
				System.out.println("You selected: Checkout\n");
				try {
					checkoutService.checkout(cartService);
				} catch (OutOfStockException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 9:
				System.out.println("Thank you for using NovaCart!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

			System.out.println("----------------------------------");

		} while (choice != 9);

		scanner.close();
	}
}