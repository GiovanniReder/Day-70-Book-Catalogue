package giovanni;
import giovanni.entities.Archive;
import giovanni.entities.Book;
import giovanni.entities.Magazine;
import giovanni.enums.Periodicity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Application {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Magazine> magazineList= new ArrayList<>();

        Archive Archivio= new Archive();


        //CREAZIONE LIBRI
        
        Book book1 = new Book("Horror", "Steven King", 700,2000, 123456789, "IT");
        Book book2 = new Book("Kitchen", "Dario Bressanini", 277,2019, 234567891, "La scienza delle verdure");
        Book book3 = new Book("Astrology", "Sylvia Brown", 276,2012, 978880462, "Profezie");

        //CREAZIONE RIVISTE

        Magazine magazine1= new Magazine(979128137, Periodicity.SETTIMANALE, 96, 2024, "Japan Magazine");
        Magazine magazine2= new Magazine(245634846, Periodicity.MENSILE, 104, 2010, "Focus");
        Magazine magazine3= new Magazine(956472348, Periodicity.SEMESTRALE, 190, 1925, "Apollo Magazine");

        //AGGIUNGO I LIBRI ALLA LISTA DEI LIBRI
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        //AGGIUNGO LE RIVISTE ALLA LISTA DELE RIVISTE

        magazineList.add(magazine1);
        magazineList.add(magazine2);
        magazineList.add(magazine3);

        //AGGIUNGO LE LISTE DI LIBRI E RIVISTE DENTRO UN UNICA LISTA ARCHIVIO

        Archivio.addBookOrMagazine(book1);
        Archivio.addBookOrMagazine(book2);
        Archivio.addBookOrMagazine(book3);
        Archivio.addBookOrMagazine(magazine1);
        Archivio.addBookOrMagazine(magazine2);
        Archivio.addBookOrMagazine(magazine3);

        System.out.println("------------------LISTA DEI LIBRI--------------");
        // System.out.println(bookList);
        //LISTA LIBRI FATTA CON STREAM
        String archivioLibri = bookList.stream().map(book -> "Title: " + book.getTitle() + " Author: " +  book.getAuthor() + " Genre: " + book.getGenre() + " Page number: " + book.getPageNumber() + " Year of pubblication: " + book.getYearOfPublication() + " ISBN: " + book.getISBN() + System.lineSeparator()).collect(Collectors.joining(", "));
        System.out.println(archivioLibri);

        System.out.println("------------------LISTA DELLE RIVISTE--------------");
        // System.out.println(magazineList);
        //LISTA RIVISTE FATTA CON STREAM
        String archivioRiviste = magazineList.stream().map(magazine -> "Title: " + magazine.getTitle()  + " Page number: " + magazine.getPageNumber() + " Year of pubblication: " + magazine.getYearOfPublication() + " Periodicity: " + magazine.getPeriodicity() + " ISBN: " + magazine.getISBN() + System.lineSeparator()).collect(Collectors.joining(", "));
        System.out.println(archivioRiviste);

        System.out.println("------------------ARCHIVIO--------------");

        System.out.println(Archivio);

        System.out.println("--------------RIMUOVO UN BOOK E UN MAGAZINE DELLA LISTA TRAMITE ISBN------------------");
        System.out.println(Archivio);

        Archivio.removeByISBN(123456789);
        Archivio.removeByISBN(245634846);

        System.out.println(Archivio);

        System.out.println("--------------RICERCO UN BOOK E UN MAGAZINE DALL' ARCHIVIO TRAMITE ISBN------------------");
        System.out.println(Archivio.searchByISBN(979128137));

        System.out.println("--------------RICERCO UN BOOK E UN MAGAZINE DALL'ARCHIVIO  TRAMITE YEARSOFPUBBLICATION------------------");
        System.out.println(Archivio.searchByYearOfPublication(2012));

        System.out.println("--------------RICERCO UN BOOK DALL'ARCHIVIO TRAMITE AUTHOR------------------");
        System.out.println(Archivio.searchByAuthor("Dario Bressanini"));
    }
}










