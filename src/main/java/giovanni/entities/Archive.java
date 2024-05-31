package giovanni.entities;

import java.util.ArrayList;
import java.util.List;
import giovanni.entities.Book;
import giovanni.entities.Magazine;

public class Archive {
    private List<Object> archivio;

    public Archive() {
        this.archivio = new ArrayList<>();
    }

    public void addBookOrMagazine(Object item) {
        this.archivio.add(item);
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

    @Override
    public String toString() {
        return archivio.toString();
    }
}
