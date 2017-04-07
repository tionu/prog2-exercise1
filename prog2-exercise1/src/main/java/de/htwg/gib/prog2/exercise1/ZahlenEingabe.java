package de.htwg.gib.prog2.exercise1;

import java.util.Scanner;

public class ZahlenEingabe {

	public static void main(String[] args) {
		int zaehler, nenner, ergebnis;

		Scanner s = new Scanner(System.in);

		System.out.println("Bitte Zähler eingeben:");
		zaehler = s.nextInt();

		System.out.println("Bitte Nenner eingeben:");
		nenner = s.nextInt();

		try {
			ergebnis = zaehler / nenner;
			System.out.println(ergebnis);
		} catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten. " + e.toString());

		}
		s.close();

	}

}
