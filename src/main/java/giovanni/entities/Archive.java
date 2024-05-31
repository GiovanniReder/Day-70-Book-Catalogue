package giovanni.entities;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    // ATTRIBUTI
    private List<Book> booksList;
    private List<Magazine> magazineList;


    // COSTRUTTORE

    public Archive(List<Book> booksList, List<Magazine> magazineList) {
        this.booksList = booksList;
        this.magazineList = magazineList;
    }

    public Archive() {

    }

    // METODI

    public void addNewBookOrMagazine(Object e) {
        if (e instanceof Book) {
            booksList.add((Book) e);
        } else if (e instanceof Magazine) {
            magazineList.add((Magazine) e);
        } else {
            throw new IllegalArgumentException("L'elemento che stai provando ad aggiungere non è ne un libro ne una rivista");
        }
    }

    // Metodo per ottenere tutti i libri e i magazine nell'archivio
    public List<Book> getBooks() {
        return booksList;
    }

    public List<Magazine> getMagazine() {
        return magazineList;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public List<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setMagazineList(List<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    @Override
    public String toString() {
        return "Archive{" +
                "booksList=" + booksList +
                ", magazineList=" + magazineList +
                '}';
    }
}