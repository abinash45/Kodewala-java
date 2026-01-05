package com.kodewala.assiggnment;

public class DiscountpriceCalculation {
  static String productName = "Lenevo laptop";
   int productPrice = 890;
   double discount =0.18;
   double finalPrice ;
   public  void productPriceCaluculation() {
	    finalPrice = (productPrice - (productPrice * discount));// 
   }
  // return  ;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountpriceCalculation dc = new DiscountpriceCalculation ();
		dc.productPriceCaluculation();
		
		System.out.println ("Product name is :"+ productName);
		System.out.println ("Product price is :"+ dc.productPrice);
		System.out.println ("Product discount is :"+ dc.discount);
		
		System.out.println ("Product final price is :"+ dc.finalPrice);
		
	}

}
