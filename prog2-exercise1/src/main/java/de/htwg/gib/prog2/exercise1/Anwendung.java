package de.htwg.gib.prog2.exercise1;
import java.util.Date;
import java.util.Scanner;

public class Anwendung {

	public static void main(String[] args) {
		Krankenhaus beispielKrankenhaus = new Krankenhaus();
		Patient patient1 = new Patient("Tommy", "Mueller", new Date(), 12345);
		Patient patient2 = new Patient("Tamara", "Winter", new Date(), 56789);

		System.out.println("Patient aufnehmen...");
		beispielKrankenhaus.neuerPatientHinzufuegen(patient1);
		System.out.println("Aufnahemdatum: " + patient1.getAufnahmedatum() + "\n");

		System.out.println("versuche den gleichen Patient nochmals aufzunehmen...");
		// gleicher Patient wird nochmals hinzugefügt
		try {
			beispielKrankenhaus.neuerPatientHinzufuegen(patient1);
		} catch (IllegalArgumentException e) {
			System.out.println("Ausnahme: " + e.getMessage());
		}

		System.out.println();
		System.out.println("weiteren Patient aufnehmen...");
		beispielKrankenhaus.neuerPatientHinzufuegen(patient2);
		System.out.println("Aufnahemdatum: " + patient2.getAufnahmedatum() + "\n");

		System.out.print("Patient abfragen...\n Bitte ID eingeben: ");
		Scanner keyboardInput = new Scanner(System.in);
		int patId;
		patId = keyboardInput.nextInt();

		try {
			Patient patient3 = beispielKrankenhaus.getPatient(patId);
			System.out.println("Patient gefunden: " + patient3.getNachname() + ", " + patient3.getName());
		} catch (IllegalArgumentException e) {
			System.out.println("Ausnahme: " + e.getMessage());

		} catch (NullPointerException e) {
			System.out.println("Ausnahme: " + e.getMessage());
		}

	}

}
