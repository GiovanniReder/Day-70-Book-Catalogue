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

   public String getAuthor() {
      return author;
   }

   public int getPageNumber() {
      return pageNumber;
   }

   public int getYearOfPublication() {
      return yearOfPublication;
   }

   public String getTitle() {
      return Title;
   }

   public long getISBN() {
      return ISBN;
   }

}
