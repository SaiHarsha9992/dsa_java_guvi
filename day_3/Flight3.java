public class Flight3{
    //declarative stage 
    private int id ;
	private String airline ;
	private String source ;
	private String destination ;
	private float fare ;
	private float duration;

    public Flight3(){
        System.out.println("From the zero arg constructor");
    }

    public Flight3(int id, String airline, String source, String destination, float fare, float duration) {
		
        this();
        System.out.println("From the all arg constructor");
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.duration = duration;
	}

    public static void main(String[] args) {
        Flight3 flight = new Flight3(1001, "AirIndia", "Bengaluru", "Delhi", 6900.5f, 3.15f);
        System.out.println("Flight details are");
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fare);
		System.out.println(flight.duration);
    }
}