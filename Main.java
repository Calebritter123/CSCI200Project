import java.util.Vector;
import java.util.Scanner;

public class Main {
			
	public static void powerSet(classSets firstSet) {
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> original1 = new Vector<Character>();		
		
		for (int i = 0; i < firstOne.size(); i++) {
			original1.add(firstOne.elementAt(i)); 
		}
		
		System.out.print("P(" + firstSet.getName() + ") = " + "{ { } ");
		for(int i = 0; i < firstOne.size(); i++) {
			System.out.print("{" + firstOne.get(i) + "} " );
		}
		
		for(int i = 0; i < firstOne.size()-1; i++) {
			//System.out.print("{" + firstOne.get(i) + "} " );
			for(int j = 1; j < firstOne.size(); j++) {
				if(firstOne.get(i) == firstOne.get(j)) {
					continue;
				}
				else {
					System.out.print("{" + firstOne.get(i) +  " " + firstOne.get(j) + "} ");
				}
			}
		}
		
		firstOne.clear();
		System.out.print("{");
		for (int i = 0; i < original1.size(); i++) {
			System.out.print(" "+ original1.get(i));
		}	
		System.out.print("}}");
		System.out.println();
		
		firstOne.addAll(original1);
		
	}
		
	
	
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
	
	public static void difference(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to get values from, and make set the intersection to newVector.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		Vector<Character> original1 = new Vector<Character>();	
		Vector<Character> original2 = new Vector<Character>();	
		
		for (int i = 0; i < firstOne.size(); i++) {
			original1.add(firstOne.elementAt(i)); 
		}
		
		for (int i = 0; i < secondOne.size(); i++) {
			original2.add(secondOne.elementAt(i)); 
		}
	
		// use for loop to add values to new vector for intersection
		firstOne.removeAll(secondOne);
		
		System.out.println("Difference(" + firstSet.getName() + "," + secondSet.getName() + ") = " + firstOne);
		
		firstOne.clear();
		secondOne.clear();
		for (int i = 0; i < original1.size(); i++) {
			firstOne.add(original1.elementAt(i)); 
		}
		for (int i = 0; i < original2.size(); i++) {
			secondOne.add(original2.elementAt(i)); 
		}
	}
	
	public static void intersection(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to get values from, and make set the intersection to newVector.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		Vector<Character> newVector = new Vector<Character>();
		Vector<Character> original1 = new Vector<Character>();	
		Vector<Character> original2 = new Vector<Character>();	
		
		for (int i = 0; i < firstOne.size(); i++) {
			original1.add(firstOne.elementAt(i)); 
		}
		
		for (int i = 0; i < secondOne.size(); i++) {
			original2.add(secondOne.elementAt(i)); 
		}
		
		// use for loop to add values to new vector for intersection
		for(int i = 0; i < firstOne.size(); i++) {
			for(int j = 0; j < secondOne.size(); j++) {
				if (firstOne.get(i) == secondOne.get(j)) {
					newVector.add(firstOne.get(i));
				}
			}
		}
		
		System.out.println("Intersection(" + firstSet.getName() + "," + secondSet.getName() + ") = " + newVector);
		
		firstOne.clear();
		secondOne.clear();
		for (int i = 0; i < original1.size(); i++) {
			firstOne.add(original1.elementAt(i)); 
		}
		for (int i = 0; i < original2.size(); i++) {
			secondOne.add(original2.elementAt(i)); 
		}
	}

	
	public static void cartesianProduct(classSets firstSet, classSets secondSet) {
		//Make 2 vectors to get values from, and make set the intersection to newVector.
		Vector<Character> firstOne = firstSet.getSet();
		Vector<Character> secondOne = secondSet.getSet();
		Vector<Character> original1 = new Vector<Character>();	
		Vector<Character> original2 = new Vector<Character>();	
		
		for (int i = 0; i < firstOne.size(); i++) {
			original1.add(firstOne.elementAt(i)); 
		}
		
		for (int i = 0; i < secondOne.size(); i++) {
			original2.add(secondOne.elementAt(i)); 
		}
		
		System.out.print("Cartesian Product(" + firstSet.getName() + "," + secondSet.getName() + ") = {");
		
		for(int i = 0; i < firstOne.size(); i++) {
			for(int j = 0; j < secondOne.size(); j++) {
				System.out.print("(" + firstOne.get(i) + ", " + secondOne.get(j) + ")");
			}
		}
		
		System.out.print("}");
		
		firstOne.clear();
		secondOne.clear();
		for (int i = 0; i < original1.size(); i++) {
			firstOne.add(original1.elementAt(i)); 
		}
		for (int i = 0; i < original2.size(); i++) {
			secondOne.add(original2.elementAt(i)); 
		}
		
		System.out.println();
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
				
				
				union(set1, set2);
				intersection(set1, set2);
				difference(set1, set2);
				difference(set2, set1);
				cartesianProduct(set1, set2);
				cartesianProduct(set2, set1);
				System.out.println();
				
				powerSet(set1);
				powerSet(set2);
				
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
		
		do {
			
			System.out.println("To modify or create a single set, press 1");
			System.out.println("To compare more than one set, press 2, or q to quit.");
			input = userInput.nextLine();
				
			
		switch (input) {
		case "q": 
			System.out.println("Goodbye.");
			System.exit(0);
		case "1": 
			System.out.println();
			System.out.println();
			System.out.println("1: Modify a set.");
			System.out.println("2: Create a set.");
			System.out.println("3: Back.");
			System.out.println("q: QUIT");
			input = userInput.nextLine();
			switch (input) {
				case "q": 
					System.out.println("Goodbye.");
					System.exit(0);
				case "1": 
					
					

				case "2": 
					
					
					
					
					
				case "3": 
					break;
					
			default: System.out.println("Unknown input: " + input);		
			}//end inner switch
			
			
			
			
		case "2":
			System.out.println();
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			}//end switch
						
		} while (input != "q"); //end while
		
		//Should be impossible to get here.
		System.out.println("How did you even get here?");	
	
	*/
	} //ends main
}	//ends class






