public class Book {

  private String title;
  private String genre;
  private int numOfPages;

  public Book(String title, String genre, int numOfPages) {
    this.title = title;
    this.genre = genre;
    this.numOfPages = numOfPages;
  }

  @Override
  public String toString() {
    return this.title;
  }

}
