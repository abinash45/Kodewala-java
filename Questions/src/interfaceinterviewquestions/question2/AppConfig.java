package interfaceinterviewquestions.question2;

public interface AppConfig {
	public static final int MAX_USERS = 600;
	public static final String APP_NAME = "MyApp";
	//int id ;(The blank final field id may not have been initialized)
 int id = 500;// accepting 
 // value must be initialized
 //int id = 500 it will be trated as public static final int id;
  void details();
}
