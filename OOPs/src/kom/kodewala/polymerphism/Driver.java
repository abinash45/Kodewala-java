package kom.kodewala.polymerphism;
class Banking {
	
}
class HDFCNetBAnking extends Banking {
	
}
public class Driver {

	public static void main(String[] args) {
		
		HDFCNetBAnking hb = new HDFCNetBAnking ();
		Banking  nb1 = new  HDFCNetBAnking ();
		//super class can refer the child classs object , here upcasting is happring so internally this line is 
		//Banking  nb1 =   (HDFCNetBAnking)new  HDFCNetBAnking ();
	}

}
