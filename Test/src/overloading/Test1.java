package overloading;
@FunctionalInterface
interface Employee{
	public void work();
}

public class Test1 {
	public static void main(String[] args) {
		Employee e=()->{
			System.out.println("employee doing work");
		};
		e.work();
	}

}
    
