package interfaceinterviewquestions.question2;

public class Driver {
	void displayConfigs() {
		System.out.println("App name :" + AppConfig.APP_NAME);
		System.out.println("Max Users:" + AppConfig.MAX_USERS);
	}

	public static void main(String[] args) {
		Application ap = new Application();
		ap.details();
		// ap.displayConfigs();
		Driver d = new Driver();
		d.displayConfigs();

	}

}

/*
 * Can an interface have instance variables? Why or why not? => No All variables in an interface are:
 * public
 * static
 * final
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */