import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> library;

  public Library() {
    this.library = new ArrayList<Book>();

  }

  public void addBook(Book book) {
    this.library.add(book);
  }

  public void removeBook(Book book) {
    this.library.remove(book);
  }

  public String getBookList() {
    return this.library.toString();
  }

}
