public class Flight4{
    //declarative stage 
    private int id = 111;
	private String airline = "SpiceJet";
	private String source = "Chennai";
	private String destination = "Hyderabad";
	private float fare = 3500;
	private float duration = 1.5f;

    public Flight4(){
        System.out.println("From the zero arg constructor");
        System.out.println("Flight details are");
		System.out.println(this.id);
		System.out.println(this.airline);
		System.out.println(this.source);
		System.out.println(this.destination);
		System.out.println(this.fare);
		System.out.println(this.duration);
    }

    public Flight4(int id, String airline, String source, String destination, float fare, float duration) {
		
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
        Flight4 flight = new Flight4(1001, "AirIndia", "Bengaluru", "Delhi", 6900.5f, 3.15f);
        System.out.println("Flight details are");
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fare);
		System.out.println(flight.duration);
    }
}