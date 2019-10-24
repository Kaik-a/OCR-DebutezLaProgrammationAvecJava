package boucle;

public class Boucle {
	public static void main(String[] args) {
		
	
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		int[] myArray = new int[] {7,2,4};
		
		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}
		for (int j: myArray) {
			System.out.println(j); //As above
		}
		
		int numberOfTrees = 0;
		while (numberOfTrees < 10) {
			numberOfTrees += 1; 
			if (numberOfTrees < 2) {
				System.out.println("I planted " + numberOfTrees + " tree");
			}
			else {
				System.out.println("I planted " + numberOfTrees + " trees");
			}
		}
		System.out.println("I have a forest");
		
	}
}
