package exampleSolution;
import java.util.Date;
import java.util.HashMap;

public class Krankenhaus {

	private HashMap<Integer, Patient> patientenliste;

	public Krankenhaus(HashMap<Integer, Patient> patientenliste) {
		this.patientenliste = patientenliste;
	}

	public Krankenhaus() {
		this.patientenliste = new HashMap<Integer, Patient>();
	}

	public HashMap<Integer, Patient> getPatientenliste() {
		return patientenliste;
	}

	public void setPatientenliste(HashMap<Integer, Patient> patientenliste) {
		this.patientenliste = patientenliste;
	}

	public void neuerPatientHinzufuegen(Patient patient) {
		
		for (Integer id : patientenliste.keySet()) {

			if (id == patient.getId()) {

				throw new IllegalArgumentException(
						"Patient wurde schon aufgenommen");

			}

		}
		patient.setAufnahmedatum(new Date());
		patientenliste.put(patient.getId(), patient);

	}

	public Patient getPatient(int patientenID) {

		if (patientenID < 10000) {

			throw new IllegalArgumentException(
					"ID muss mindestens 5 Stellen haben");
		} else

		if (patientenliste.get(patientenID) == null) {

			throw new NullPointerException("Patient nicht vorhanden");
		} else {

			return patientenliste.get(patientenID);
		}
	}

	public void patientEntlassen(int id) {

		if (patientenliste.get(id) == null) {

			throw new NullPointerException("Patient nicht vorhanden");
		} else {
			patientenliste.remove(id);
		}
	}

}
