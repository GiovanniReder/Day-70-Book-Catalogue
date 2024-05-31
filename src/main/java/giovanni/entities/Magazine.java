package giovanni.entities;

import giovanni.enums.Periodicity;

public class Magazine {
    //ATTRIBUTI
    private long ISBN;
    private String Title;
    private int yearOfPublication;
    private int pageNumber;
    private Periodicity periodicity;

    //COSTRUTTORE
    public Magazine(int ISBN, Periodicity periodicity, int pageNumber, int yearOfPublication, String title) {
        Title = title;
        this.periodicity = periodicity;
        this.pageNumber = pageNumber;
        this.yearOfPublication = yearOfPublication;
        this.ISBN = ISBN;
    }
//METODI

    @Override
    public String toString() {
        return "Magazine{" +
                "ISBN=" + ISBN +
                ", Title='" + Title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", pageNumber=" + pageNumber +
                ", periodicity=" + periodicity +
                '}';
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
