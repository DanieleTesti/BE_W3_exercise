package runnable;

import java.sql.SQLException;
import java.util.List;

import model.Archive;
import model.Catalogue;
import model.Prestiti;

public class Runnable {

	public static void main(String[] args) {

		// <<<<<<<<<<<<<<<<<<<CREAZIONE TABELLE>>>>>>>>>>>>>>>>>>>
//		Book book1 = new Book("autore2", enum_genere.HORROR, "libro2", 2023, 150);
//		Book book2 = new Book("autore1", enum_genere.BAMBINI, "libro1", 2017, 50);
//
//		Magazine magazine1 = new Magazine(enum_frequency.MENSILE, "magazine1", 2017, 67);
//		Magazine magazine2 = new Magazine(enum_frequency.ANNUALE, "magazine2", 2021, 120);
//
//		Utente utente = new Utente(10l, "Daniele", "Testi", LocalDate.of(2002, 9, 14));
//		Utente utente1 = new Utente(12l, "Francesco", "Totti", LocalDate.of(1977, 12, 24));
//		Utente utente2 = new Utente(14l, "Mario", "Rossi", LocalDate.of(1997, 4, 11));
		try {
//
//			Prestiti prestito1Utente = new Prestiti(utente, book1, LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 4));
//			Prestiti prestito2Utente = new Prestiti(utente, magazine1, LocalDate.of(2023, 2, 10),
//					LocalDate.of(2023, 2, 12));
//
//			Prestiti prestito1Utente1 = new Prestiti(utente1, book1, LocalDate.of(2023, 2, 2),
//					LocalDate.of(2023, 2, 10));
//
//			Prestiti prestito1Utente2 = new Prestiti(utente2, book2, LocalDate.of(2023, 2, 3), null);

			// <<<<<<<<<<<<<<<<<<<METODO CHE AGGIUNGE UN ELEMENTO AL
			// DATABASE>>>>>>>>>>>>>>>>>>>
//			Catalogue.addToCat(book1);
//			Catalogue.addToCat(book2);
//			Catalogue.addToCat(magazine1);
//			Catalogue.addToCat(magazine2);

			// <<<<<<<<<<<<<<<<<<<METODO CHE AGGIUNGE UN UTENTE ALLA
			// TABELLA>>>>>>>>>>>>>>>>>>>
//			Catalogue.addToUtente(utente);
//			Catalogue.addToUtente(utente1);
//			Catalogue.addToUtente(utente2);

			// <<<<<<<<<<<<<<<<<<<METODO CHE AGGIUNGE PRESTITI ALLA
			// TABELLA>>>>>>>>>>>>>>>>>>>
//			Catalogue.addToPrestiti(prestito1Utente);
//			Catalogue.addToPrestiti(prestito2Utente);
//
//			Catalogue.addToPrestiti(prestito1Utente1);
//
//			Catalogue.addToPrestiti(prestito1Utente2);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTOPER ID>>>>>>>>>>>>>>>>>>>
			Catalogue.getById(4l);

			// <<<<<<<<<<<<<<<<<<<METODO CHE ELIMINA UN ELEMENTO CERCATO PER
			// ID>>>>>>>>>>>>>>>>>>>
//			Catalogue.delete(3l);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTO PER ANNO>>>>>>>>>>>>>>>>>>>
			List<Archive> archives = Catalogue.getByYear(2023);
			System.out.println("\nArchivi pubblicati nel 2023: " + archives);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTO PER AUTORE>>>>>>>>>>>>>>>>>>>

			List<Archive> ArchiveByAuthor = Catalogue.getByAuthor("autore1");
			System.out.println("\nLibri cercati per autore: " + ArchiveByAuthor);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTO PER TITOLO>>>>>>>>>>>>>>>>>>>

			List<Archive> archiveByTitle = Catalogue.getByTitle("lib");
			System.out.println("\nLibri cercati per titolo: " + archiveByTitle);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN PRESTITO SCADUTO NON
			// RESTITUITO>>>>>>>>>>>>>>>>>>>
			List<Prestiti> PrestitiScaduti = Catalogue.PrestitiScaduti();
			System.out.println("\n" + PrestitiScaduti);

			// <<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN PRESTITO NON SCADUTO PER N.
			// TESSERA>>>>>>>>>>>>>>>>>>>
			List<Prestiti> Prestiticercati = Catalogue.getPrestitoById(10l);
			System.out.println(Prestiticercati);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
