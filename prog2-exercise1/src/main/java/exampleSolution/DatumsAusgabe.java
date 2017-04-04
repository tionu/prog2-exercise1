package exampleSolution;
public class DatumsAusgabe {

	
	
	
	public static void datumString(int tag, int monat, int jahr) {
		if (tag > 31 || tag < 1 || monat > 12 || monat < 1) {
			throw new IllegalArgumentException("UngŸltiges Datum Ÿbergeben.");
		} else {
			System.out.println(tag + "." + monat + "." + jahr);
		}
	}

	public static void main(String[] args) {
		DatumsAusgabe datum = new DatumsAusgabe();
		datum.datumString(32, 04, 1993);
	}

}
