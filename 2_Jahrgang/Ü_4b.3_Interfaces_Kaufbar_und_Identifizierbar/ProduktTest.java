package src;

/**
 * Diese Klasser ist die Main Klasse der Produkte
 * Es wurden noch zusätzlich in der neusten Version Testvorgänge für die Exceptions hinzugefügt
 * In dieser Erweiterung wurde um Kaufbar und Identifizierbar erweitert 
 * @author 	Kacper Bohaczyk
 * @date 	22-04-2022
 */
public class ProduktTest {
	
	/**
	 * Ist die main Klasse
	 * @param args 	Argumente
	 * @throws NumericRangeException	Diese Exception catcht ob die rübergegebenen Parameter im gültigem Bereich sind
	 */
	public static void main(String[]args) throws NumericRangeException {
		Produkt p1 = new Produkt(1234567, "Mappe rot", "eine dünne rote Mappe", 2.49);
		Produkt p2 = new Produkt(987654321, "Mappe rot", "eine dünne rote Mappe", 2.49);
		Produkt p3 = new Produkt(15082005, "Buntstift", "Ein grüner Stift", 2.50);
		// Produkt p4 = new Produkt(2005, "Buch", "Ein fantasy Buch", 4.50);		// Hier kann ein Test ausgeführt werden ob die Exceptions funktionieren in der Klasse Produkt
		
		
		ErweitertesProdukt pe1 = new ErweitertesProdukt(15082005, "Radiergummi", "Ein Radiergummi zum löschen", 3.0 , 20);
		ErweitertesProdukt pe2 = new ErweitertesProdukt(15082005, "Radiergummi", "Ein Radiergummi zum löschen", 3.0 , 20);
		ErweitertesProdukt pe3 = new ErweitertesProdukt(23221315, "Bleistift", "Ein Bleistift zum schreiben", 2.0 , 10);
		// ErweitertesProdukt pe4 = new ErweitertesProdukt(23223, "Kuli", "Ein Bleistift zum schreiben", 2.0 , -10); 	// Hier kann ein Test ausgeführt werden ob die Exceptions funktionieren in der Klasse ErweitertesProdukt
		pe1.setBewertungen(4);	

		Bewertung bewertung = new Bewertung(3.0,"Ziemlich gut");
		Bewertung bewertung2 = new Bewertung(5.0,"Excellent");
		Bewertung bewertung3 = new Bewertung(5.0,"Excellent");

		/*
		 * Hier wird alles Vorbereitet um die Methoden zu testen
		 */
		
		System.out.println(p1.gesamtPreis(3));				// Testet aus ob die Methode gesamtPreis richtig funktioniert
		System.out.println(p1.toString());				// Testet aus ob alle Daten rübergegeben werden
		System.out.println("Vergleich: " + p1.equals(p2));		// vergleicht ob die Methode equals aus der Klasse "Produkt" funktioniert (solte true zurückgeben)
		System.out.println("Vergleich: " + p1.equals(p3));		// vergleicht ob die Methode equals aus der Klasse "Produkt" funktioniert (solte false zurückgeben)
		System.out.print(p1.hashCode());				// führt die Methode hashCode aus der Klasse "Produkt" aus
		/**
		 * Hier werden alle Methoden für die Klasse: "Produkt" getestet
		 */
		
		pe1.setBewertungen(4);					// settet die länge für den Bewertungsarray
		pe1.neueBewertung(bewertung);				// Fügt eine neue Bewertung hinzu um die Methode durchschnittsbewertung austesten zu können
		pe1.neueBewertung(bewertung2);				// Fügt eine neue Bewertung hinzu um die Methode durchschnittsbewertung austesten zu können
		System.out.println(pe1.ermaessigterPreis());		// probiert die Methode ermaessigterPreis aus
		System.out.println(pe1.gesamtPreis(2));			// checkt nach ob die Methode gesamtPreis funktioniert
		System.out.println(pe1.durchschnittsbewertung());	// gibt die Durchschnittsbewertung zurück
		System.out.print(pe1.toString());			// gibt alle Daten in einem String zurück
		System.out.println(pe1.equals(pe2));			// vergleicht ob die Methode equals aus der Klasse ErweitertesProdukt funktioniert (solte true zurückgeben)
		System.out.println(pe1.equals(pe3));			// vergleicht ob die Methode equals aus der Klasse ErweitertesProdukt funktioniert (solte false zurückgeben)
		System.out.println(pe1.hashCode());			// führt die Methode hashCode aus der Klasse "ErweitertesProdukt" aus
		/**
		 * Hier werden alle Methoden für die Klasse: "ErweitertesProdukt2 getestet
		 */
		System.out.println("Vergleich: " + bewertung2.equals(bewertung3));	// vergleicht ob die Methode equals in der Klasse Bewertung funktioniert (solte true zurückgeben)
		System.out.println("Vergleich: " + bewertung.equals(bewertung2));	// vergleicht ob die Methode equals in der Klasse Bewertung funktioniert (solte true zurückgeben)
		System.out.println(bewertung.hashCode());				// führt die Methode hashCode aus der Klasse "Bewertung" aus
		/**
		 * Hier werden alle Methoden für die Klasse: "Bewertung" getestet
		 */
		
		System.out.println(p1.identifier());					// gibt eine ID mit 15 stellen zurück
		System.out.println(p1.gesamtPreis(2));					// gibt den gesamten Preis zurück
		System.out.println(p1.getPreis());					// gibt den Preis
		
		/*
		 * Diese Methoden Testen ob kaufbar und Identifizierbar richtig inteplementiert wurden
		 */
	}
}
