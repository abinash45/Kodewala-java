package polymerphisim;

public class Person {
	void showRole () {
		System.out.println("I am a person with multiple role");
	}

}
class Student extends Person {
	
	@Override
	void showRole () {
		System.out.println("I am a student");
	}
}

class BoyFriend extends Person {
	@Override
	void showRole () {
		System.out.println("I am a boyfriend.");
	}
}


class PolymerphismExample {
	 public static void main (String args []) {
		 Person person;
		 person = new Person ();
		 person.showRole();
		 person = new Student ();
		 person.showRole();
		 person = new BoyFriend();
		 person.showRole();
	 }
}