package aufgabe2;
import java.util.Date;

public class Patient {

	private String name;
	private String nachname;
	private Date geburtstag;
	private int id;
	private Date aufnahmedatum;

	public Patient(String name, String nachname, Date geburtstag, int id) {
		this.name = name;
		this.nachname = nachname;
		this.geburtstag = geburtstag;
		idValidieren(id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Date getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		idValidieren(id);

		this.id = id;

	}

	public void idValidieren(int id) {
		if (id < 10000) {

			throw new IllegalArgumentException("ID muss mindestens 5 Stellen haben");
		}

	}

	public Date getAufnahmedatum() {
		if (aufnahmedatum == null) {

			throw new NullPointerException("Patient noch nicht aufgenommen");

		} else {

			return aufnahmedatum;
		}
	}

	public void setAufnahmedatum(Date aufnahmedatum) {
		this.aufnahmedatum = aufnahmedatum;
	}

}
