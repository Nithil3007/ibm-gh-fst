package Activity11;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> colours = new HashMap<>();
		colours.put(1,"Blue");
		colours.put(2,"Red");
		colours.put(3,"Yellow");
		colours.put(4,"Green");
		colours.put(5,"Purple");
		
		System.out.println("Colours - " + colours);
		
		colours.remove(1);
		
		System.out.println("Colours with key 1 removed");
		
		System.out.println("Colours - " + colours);

		if (colours.containsValue("Green")) {
			System.out.println("Green is present");
		}
		else {
			System.out.println("Green is not present");
		}
		System.out.println("Size of the Map = " + colours.size());
	}

}
