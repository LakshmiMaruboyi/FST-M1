package activities;

import java.util.ArrayList;

public class Activity9 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Mange");
		myList.add("Orange");
		myList.add(3, "Grapes");
		myList.add(1,"Papaya");
		for(String s:myList){
            System.out.println(s);
        }
		System.out.println("the 3rd name in the ArrayList" + myList.get(2));
		System.out.println("number of names in the ArrayList" + myList.size());
		System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
		myList.remove("Papaya");
		System.out.println("size after removed name from list " +myList.size());

	}

}