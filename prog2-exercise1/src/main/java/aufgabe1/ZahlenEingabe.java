package aufgabe1;

import java.util.Scanner;

public class ZahlenEingabe {

	public static void main(String[] args) {
		int zaehler, nenner, ergebnis;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte Zähler eingeben:");
		zaehler = scanner.nextInt();

		System.out.println("Bitte Nenner eingeben:");
		nenner = scanner.nextInt();

		try {
			ergebnis = zaehler / nenner;
			System.out.println(ergebnis);
		} catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten. " + e.toString());

		}
		scanner.close();

	}

}
