package kom.kodewala.polymerphism;
class Person {
	void role () {
		System.out.println("I am a person.");
	}
}

class Father extends Person {
	@Override
	void role () {
		System.out.println ("I am father .");
	}
}
class Son extends Father {
	void role () {
		System.out.println("I am a son.");
	}
}
public class Driver1 {

	public static void main(String[] args) {
		Person p = new Person ();
		System.out.println("== Person p = new Person ();==");
		p.role(); //I am a person.
        
        Father f = new Father ();
        System.out.println("== Father f = new Father ();==");
        f.role();//I am father .
        
        Son s = new Son ();
        System.out.println("== Son s = new Son () ==");
        s.role();//I am a son.
        
        Person p1 = new Father();
        System.out.println("==  Person p1 = new Father();");
        p1.role();
        
        Person p2 = new Son();
        p2.role();
        
        Father p3 = new Son();
        p3.role();
        
       // Son p4 = new Father ();
	}

}
