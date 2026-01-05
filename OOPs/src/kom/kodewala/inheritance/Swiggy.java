package kom.kodewala.inheritance;

class InstaMart {
	String location = "Bhubaneswar";
	String userName = "Abinash Nayak";
	int userId = 56477;
	public void areaDetails() {
		System.out.println("This is in Odisha.");
	}
	public void userDetails() {
		System.out.println("The name of user is:" + userName + "The location is :" + location);
	}
}
public class Swiggy extends InstaMart {
		String productName = "Burger";
		double price = 198.0;

	public static void main(String[] args) {
		InstaMart im = new InstaMart();
		Swiggy sw = new Swiggy ();
		im.areaDetails();
		im.userDetails();
		System.out.println(im.location);
		System.out.println(im.userName);
		System.out.println(sw.productName);
		System.out.println(sw.price);
		

	}

}
