package com.kodewala.encapsulation;

public class Order {
	private int orderId;
	private String itemName;
	private String address;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		if (orderId > 0)
			this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	class Zepto {
		public static void main(String[] args) {
			Order or = new Order();
			or.setOrderId(2367);
			or.setAddress("Bhubaneswar");
			or.setItemName("Laptop");
			System.out.println(or.getAddress());
			System.out.println(or.getItemName());
			System.out.println(or.getOrderId());

		}

	}
}
