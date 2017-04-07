package de.htwg.gib.prog2.exercise1;
public class ArrayException {

	public static void main(String[] args) {
		int array[] = new int[] { 10, 20, 30, 40, 50 };
		int counter = 0; 
		
		try {
			while (true) {
				System.out.println(array[counter]);
				counter++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fertig");
		}
	}
}