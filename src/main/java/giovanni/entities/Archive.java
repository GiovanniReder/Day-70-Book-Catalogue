package giovanni.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import giovanni.entities.Book;
import giovanni.entities.Magazine;

public class Archive {
    private List<Object> archivio;

    public Archive() {
        this.archivio = new ArrayList<>();
    }
//ESERCIZIO 1 METODO PER AGGIUNGERE SIA UN BOOK CHE UN MAGAZINE
    public void addBookOrMagazine(Object item) {
        this.archivio.add(item);
    }

//ESERCIZIO 2 METODO PER RIMUOVERE SIA UN BOOK CHE UN MAGAZINE DA ARCHIVIO TRAMITE IL SUO ISBN
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

//ESERCIZIO 3 METODO PER RICERCARE SIA UN BOOK CHE UN MAGAZINE DA ARCHIVIO TRAMITE IL SUO ISBN
    public Object searchByISBN(long isbn) {
        for (Object item : archivio) {
            if (item instanceof Book) {
                if (((Book) item).getISBN() == isbn) {
                    return item;
                }
            } else if (item instanceof Magazine) {
                if (((Magazine) item).getISBN() == isbn) {
                    return item;
                }
            }
        }
        return null;
    }

//ESERCIZIO 4 METODO PER RICERCARE SIA UN BOOK CHE UN MAGAZINE DA ARCHIVIO TRAMITE IL SUO YEAROFPUBBLICATION
    public List<Object> searchByYearOfPublication(int year) {
        return archivio.stream()
                .filter(item -> {
                    if (item instanceof Book) {
                        return ((Book) item).getYearOfPublication() == year;
                    } else if (item instanceof Magazine) {
                        return ((Magazine) item).getYearOfPublication() == year;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public Book searchByAuthor(String author) {
        List<Object> resultList = archivio.stream()
                .filter(item -> {
                    if (item instanceof Book) {
                        return ((Book) item).getAuthor().equals(author);
                    }
                    return false;
                })
                .collect(Collectors.toList());

        if (resultList.size() == 1) {
            return (Book) resultList.get(0);
        } else {
            System.out.println("Hai inserito un autore non valido");
        }
            return null;
    }


    @Override
    public String toString() {
        return archivio.toString();
    }
}
