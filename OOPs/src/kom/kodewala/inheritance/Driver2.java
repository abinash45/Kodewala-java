package kom.kodewala.inheritance;

class Mla {
	//public void MlaDetails () {
	String location ;
	int periodTime ;
     String name ;
     public void MlaDetails () {
    	 System.out.println("Location: " + location);
         System.out.println("Period Time: " + periodTime);
         System.out.println("Name: " + name);
    	 
     }
}

class ChiefMinister extends Mla{
	
	//public void ChiefMinisterDetailss () {
	int voteMargin;
	//}
	public void ChiefMinisterDetails () {
		
	}
}

public class Driver2 {

	public static void main(String[] args) {
		ChiefMinister cm = new ChiefMinister ();
	
		cm.location="Mumbai";
		
	        cm.periodTime = 5;
	        cm.name = "Nabben Pattaink";
	        cm.voteMargin = 200000;

	        cm.MlaDetails();
	        cm.ChiefMinisterDetails();
		

	}
	

}
