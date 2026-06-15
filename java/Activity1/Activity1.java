package Activity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ABC = new Car();
		ABC.colour = "Black";
		ABC.make = 2014;
		ABC.transmission = "Manual";
		
		ABC.displayCharacterstics();
		ABC.accelerate();
		ABC.brake();
	}

}
