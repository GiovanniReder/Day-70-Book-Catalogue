package giovanni.entities;

public class Book {
   //ATTRIBUTI
   private String Title;
   private String author;
   private int yearOfPublication;
   private int pageNumber;
   private String genre;
   private long ISBN;

   //COSTRUTTORE

   public Book(String genre, String author, int pageNumber, int yearOfPublication, int ISBN, String title) {
      Title = title;
      this.author = author;
      this.genre = genre;
      this.pageNumber = pageNumber;
      this.yearOfPublication = yearOfPublication;
      this.ISBN = ISBN;
   }


   //METODI


   @Override
   public String toString() {
      return "Book{" +
              "Title='" + Title + '\'' +
              ", author='" + author + '\'' +
              ", yearOfPublication=" + yearOfPublication +
              ", pageNumber=" + pageNumber +
              ", genre='" + genre + '\'' +
              ", ISBN=" + ISBN +
              '}';
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
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

   public long getISBN() {
      return ISBN;
   }

   public void setISBN(long ISBN) {
      this.ISBN = ISBN;
   }
}
