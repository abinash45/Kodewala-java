package com.kodewala.inheritance_project1;

public class Driver {

	public static void main(String[] args) {
		ElectronicsProduct laptop =
                new ElectronicsProduct("Laptop", 60000.0);

        ClothingProduct tshirt =
                new ClothingProduct("T-Shirt", 1500.00,"L");

        System.out.println("---- Electronics Product ----");
        laptop.showElectronicsDetails();

        System.out.println("---- Clothing Product ----");
        tshirt.showClothingDetails();
    }
}

/*private does NOT mean:

The value can never change ❌

 private DOES mean:

The variable cannot be accessed directly

Only the class itself can touch it

Changes must go through methods
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 






*/