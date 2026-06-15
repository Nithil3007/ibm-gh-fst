package Activity10;

import java.util.Set;
import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> hs = new HashSet<>();
		hs.add("ItemA");
		hs.add("ItemB");
		hs.add("ItemC");
		hs.add("ItemD");
		hs.add("ItemE");
		hs.add("ItemF");
		System.out.println(hs);
		
		System.out.println("Size of hs - " + hs.size());
		
		hs.remove("ItemA");
		
		try {
			hs.remove("ItemZ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Item not found");
		}
		
		if (hs.contains("ItemB")) {
			System.out.println("ItemB is present!!");
		}
		else {
			System.out.println("Item not present!!");
		}
		
		System.out.println(hs);

	}

}
