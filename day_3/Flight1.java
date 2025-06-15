// ZERO INTIALIZATION OF VARIABLES
public class Flight1{
    //declarative stage 
    private int id ;
	private String airline ;
	private String source ;
	private String destination ;
	private float fare ;
	private float duration;

    public Flight1(){

    }

    public static void main(String[] args) {
        Flight1 flight = new Flight1();
        System.out.println("Flight details are");
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fare);
		System.out.println(flight.duration);
    }
}