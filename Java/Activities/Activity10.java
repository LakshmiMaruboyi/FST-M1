package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<String>();
		hs.add("M");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("M");
		hs.add("X");
		System.out.println("Original HashSet: " + hs); 
		System.out.println("size of the hashset" + hs.size());
		 System.out.println("Removing A from HashSet: " + hs.remove("A"));
		
		if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
		System.out.println("Is i is in hashset: " + hs.contains("i"));
		System.out.println("Original HashSet: " + hs);
			
		}
		
		

	}

