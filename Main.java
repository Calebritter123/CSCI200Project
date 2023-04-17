import java.util.Vector;
import java.util.Scanner;

public class Main {
			
	public static boolean equals(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to compare.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		
		//Check if the two vectors are equal, and print the result.
		if (firstOne.equals(secondOne)) {
			System.out.println(firstSet.getName() + " = " + secondSet.getName() + ": true");
			return true;
		} else {
			System.out.println(firstSet.getName() + " = " + secondSet.getName() + ": false");
			return false;
		}
	}
	
	public static void union(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to get values from, and make set the union to newVector.
		
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		Vector<Character> newVector = new Vector<Character>();	
		Vector<Character> original = new Vector<Character>();	
		
		for (int i = 0; i < secondOne.size(); i++) {
			original.add(secondOne.elementAt(i)); 
		}
		
		newVector.addAll(firstOne); 	//Add all of the first set into the new vector.
		secondOne.removeAll(firstOne);	//Remove all of the first elements from the second Set.
		newVector.addAll(secondOne);	//Add the remaining second Set into the new Vector.
		
		System.out.println("Union(" + firstSet.getName() + "," + secondSet.getName() + ") = " + newVector);
		
		
		secondOne.clear();
		for (int i = 0; i < original.size(); i++) {
			secondOne.add(original.elementAt(i)); 
		}
		
	}
	
	public static void isSubset(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to compare.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		
		//Check if the first vector is inside the second vector and print result.
		if (secondOne.containsAll(firstOne)) {
			System.out.println(firstSet.getName() + " is a subset of " + secondSet.getName() + ": true" );
		} else {
			System.out.println(firstSet.getName() + " is a subset of " + secondSet.getName() + ": false" );
		}
	}
	
	public static void testFunctions() {
		//Default Examples Classes and their values.
		
				classSets set1 = new classSets();
				classSets set2 = new classSets();
				int numberOfClasses = 0;
				
				//Set their names properly.
				set1.setName(numberOfClasses); 
				numberOfClasses++;
				set2.setName(numberOfClasses);	
				numberOfClasses++;
				
				//Set their values properly.
				set1.addElement('1'); set1.addElement('2'); set1.addElement('3'); 
				set2.addElement('1'); set2.addElement('2'); set2.addElement('4'); 

				//Test printing out the sets using the classSets class.
				set1.printSet();
				set2.printSet();
				System.out.println();	
				
				//Test printing the Cardinality of the set using the classSets class.
				set1.printCardinality();
				set2.printCardinality();
				System.out.println();	
				
				//Test various methods and stuff.
				equals(set1, set2);
				isSubset(set1, set2);
				isSubset(set2, set1);
				System.out.println();	
				
				union(set1, set2);
				System.out.println();	
				
				set1.printSet();
				set2.printSet();
	}
	
	
	
	
	public static void main(String[] args) {
		//old main as a method so i can try to make a menu
		testFunctions();
		/*
		String input;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to set calculator 3000");
		System.out.println("To modify or create a single set, press 1");
		System.out.println("To compare more than one set, press 2, or q to quit.");
		input = userInput.nextLine();
		
		while (input != "q") {
		switch (input) {
		case "q": 
			System.exit(0);
		case "1": 
			System.out.println();
			System.out.println();
			System.out.println("A: modify a set.");
			System.out.println("B: Create a set.");
			break;
		case "2":
			System.out.println();
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			
			}//end switch
		}//end while
		
		
		*/
		
		
		
	} //ends main
}	//ends class






