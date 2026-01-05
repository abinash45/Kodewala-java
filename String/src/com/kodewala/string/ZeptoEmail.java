package com.kodewala.string;

public class ZeptoEmail {

	public static void main(String[] args) {
		String userName = "Abinash";
		String orderNo = "989888";
		String orderName = "Head Phone";
		String orderDate = "8/12/25";
		String orderAmount = "7899";
		String deliveryDate = "25/12/25";

	StringBuilder sb = new StringBuilder ();
	sb.append("Dear").append(userName).append(",").append("\n");
	sb.append("Thank Youu For Placing Order with us. Please check your order summary below").append("\n");
	sb.append("Your order no is :").append(orderNo).append("\n");
	sb.append("Name of the product is :").append(orderName).append("\n");
	sb.append("Order placed date is  :").append(orderDate).append("\n");
	sb.append("Your order amount is :").append(orderAmount).append("\n");
	sb.append("Delivery date is :").append(deliveryDate).append("\n");
	sb.append("Regards ,").append("\n"); 
	sb.append("Team Zepto").append("\n");
	System.out.println(sb);
	
	
	}

}
