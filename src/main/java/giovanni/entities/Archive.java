package giovanni.entities;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<Book> bookList = new ArrayList<>();
    private List<Magazine> magazineList = new ArrayList<>();


//addBookOrMagazine è il metodo richiesto dal primo esercizio e mi permette di aggiungere sia un magazine che un book
    // inoltre è stata gestita anche l'eccezione
    public void addBookOrMagazine(Object e) {
        if (e instanceof Book) {
            bookList.add((Book) e);
        } else if (e instanceof Magazine) {
            magazineList.add((Magazine) e);
        } else {
            throw new IllegalArgumentException("Element must be either a Book or a Magazine");
        }
    }


    public void removeByISBN(long isbn) {
        archivio.removeIf(item -> {
            if (item instanceof Book) {
                return ((Book) item).getISBN() == isbn;
            } else if (item instanceof Magazine) {
                return ((Magazine) item).getISBN() == isbn;
            }
            return false;
        });
    }


    public List<Book> getBooks() {
        return bookList;
    }

    public List<Magazine> getMagazines() {
        return magazineList;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "bookList=" + bookList +
                ", magazineList=" + magazineList +
                '}';
    }
}