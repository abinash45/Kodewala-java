package kom.kodewala.polymerphism;

class InstaMart extends Object {
	private String employeeId ;
	public InstaMart (String employeeId) {
		this.employeeId=employeeId;
	}
	@Override
	public boolean equals (Object obj) {
		InstaMart sw2 =  (InstaMart) obj;
		return this.employeeId.equals(sw2.employeeId);
	}
	
}

public class Swiggy {

	public static void main(String[] args) {
		
		InstaMart sw1 = new InstaMart ("AB234");
		
		InstaMart sw2 = new InstaMart ("AB234");
		System.out.println(sw1.equals(sw2));
	}

}
