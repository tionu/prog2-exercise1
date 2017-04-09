package aufgabe3;

public class DatumsAusgabe {

	public static String datumsString(int tag, int monat, int jahr) {
		String result = tag + "." + monat + "." + jahr;
		if (tag > 31 || tag < 1 || monat > 12 || monat < 1) {
			throw new IllegalArgumentException("invalid date: " + result);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(DatumsAusgabe.datumsString(5, 11, 1995));
		System.out.println(DatumsAusgabe.datumsString(0, 11, 1995));
	}

}
