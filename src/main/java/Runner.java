import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Library library = new Library();

        System.out.println("Lets add a book to our Library!");
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.println("Please write the title of the book:");
                String inputTitle = scanner.nextLine();
                System.out.println("Please write the genre of the book:");
                String inputGenre = scanner.nextLine();
                System.out.println("Please write the number of pages of the book:");
                String inputStrNumber = scanner.nextLine();
                int inputNum = Integer.parseInt(inputStrNumber);

                Book newBook = new Book(inputTitle, inputGenre, inputNum);

                library.addBook(newBook);

                System.out.println(inputTitle + " has been added to the Library!");
                System.out.println("Do you want to add more books to the library? (y/n):");
                String answer = scanner.nextLine();

                if (answer.equals("n")) {
                    System.out.println("Goodbye!");
                    break;
                }

            }
        }

        System.out.println(library.getBookList());

    }
}
