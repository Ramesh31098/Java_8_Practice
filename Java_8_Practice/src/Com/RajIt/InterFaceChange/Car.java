package Com.RajIt.InterFaceChange;
interface Vehical{
	public  void Start ();
	public static void Clean() {
		System.out.println("Engin Cleaning");
	}
	  public default void run() {
		 System.out.println( "Vehical Running ");
	 }
	 default void Stop() {
		 System.out.println("Vehical stoped");
	 }
	 
}
public class Car implements Vehical{
	 public static void main(String[] args) {
		Car car= new Car();
		car.Start();
		 car.run();
		  car.Stop();
	}
	 public void Start () {
		 System.out.println(" Car Started");
	 }
	 public void Stop() {
		 System.out.println(" Car Is is stoped ");
	 }
	  public void run() {
		  System.out.println("car is running");
	  }
	 
	
	
	
}