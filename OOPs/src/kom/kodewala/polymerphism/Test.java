package kom.kodewala.polymerphism;

class Male {
	void introduce () {
		System.out.println("I am the person.");
	}
}
 
class Student extends Male {
	void introduce () {
		System.out.println("I am the student");
	}
}

class Boyfriend extends Male{
	void introduce () {
		System.out.println("I am the boyfriend");
	}
}


public class Test {

	public static void main(String[] args) {
	//Person p = new Person ();
		Male p;



		p= new Student ();
		p.introduce();
		p= new Student ();
	p.introduce ();
	
	p = new Boyfriend ();
	p.introduce();
	
	p = new Male();
	p.introduce();
	
	//Person p = new Student (); cant happen due to duplicacy
	
	}

}
