package giovanni.files;
import giovanni.entities.Archive;
import giovanni.entities.Book;
import giovanni.entities.Magazine;
import giovanni.enums.Periodicity;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilesMain {
    public static void main(String[] args) {
        File file = new File("src/ArchivioLocale.txt"); // Creo un riferimento alla posizione nelle cartelle del file

        try {

            Archive Archivio = new Archive();
            Book book1 = new Book("Horror", "Steven King", 700,2000, 123456789, "IT");
            Book book2 = new Book("Kitchen", "Dario Bressanini", 277,2019, 234567891, "La scienza delle verdure");
            Book book3 = new Book("Astrology", "Sylvia Brown", 276,2012, 978880462, "Profezie");
            Magazine magazine1= new Magazine(979128137, Periodicity.SETTIMANALE, 96, 2024, "Japan Magazine");
            Magazine magazine2= new Magazine(245634846, Periodicity.MENSILE, 104, 2010, "Focus");
            Magazine magazine3= new Magazine(956472348, Periodicity.SEMESTRALE, 190, 1925, "Apollo Magazine");
            Archivio.addBookOrMagazine(book1);
            Archivio.addBookOrMagazine(book2);
            Archivio.addBookOrMagazine(book3);
            Archivio.addBookOrMagazine(magazine1);
            Archivio.addBookOrMagazine(magazine2);
            Archivio.addBookOrMagazine(magazine3);


             FileUtils.writeStringToFile(file, String.valueOf(Archivio), StandardCharsets.UTF_8, true);


            System.out.println("File scritto correttamente!");

            String contenuto = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println(contenuto);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}






