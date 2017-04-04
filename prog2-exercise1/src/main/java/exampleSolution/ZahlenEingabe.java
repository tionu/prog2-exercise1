package exampleSolution;
import java.util.Scanner;

public class ZahlenEingabe {

	public static void main(String args[]) {

		int zahl1, zahl2, ergebnis;

		Scanner s = new Scanner(System.in);

		zahl1 = s.nextInt();

		zahl2 = s.nextInt();

		try {
			
			ergebnis = zahl1 / zahl2;
			System.out.println(ergebnis);

		} catch (Exception e) {

			System.out.println("Oh nein! es ist ein Fehler aufgetreten" + e.toString());

		}

		s.close();

	}

}
