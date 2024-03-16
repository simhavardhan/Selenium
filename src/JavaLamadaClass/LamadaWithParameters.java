package JavaLamadaClass;

public class LamadaWithParameters {

	public static void main(String[] args) {
		
		krishna k = (location,destination)->{
			System.out.println("Ticket Booked form " + location +" to " + destination);
			return destination;
		};
		k.Booking("Rajahmundry","Hyderabad");
		System.out.println(k.Booking("Rajahmundry","Hyderabad"));
		System.out.println(k);

	}

}

@FunctionalInterface
interface krishna{
	
	public String Booking(String location, String destination);
}
