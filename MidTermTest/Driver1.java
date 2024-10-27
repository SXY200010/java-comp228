import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book[] books = new Book[2];

        for (int i = 0; i < books.length; i++) {
            Book book = null;

            System.out.println("Enter the title of the book:");
            String title = input.nextLine();
            System.out.println("Enter the ISBN of the book:");
            String ISBN = input.nextLine();
            System.out.println("Enter the publisher of the book:");
            String publisher = input.nextLine();
            System.out.println("Enter the year of publication for the book:");
            int year = input.nextInt();
            System.out.println("Enter the price of the book:");
            double price = input.nextDouble();
            input.nextLine();

            while (true) {
                System.out.println("Choose a book genre (science or children)");
                String genre = input.nextLine();
                if (genre.equalsIgnoreCase("science")) {
                    books[i] = new ScienceBook(title, ISBN, publisher, price, year);
                    break;
                } else if (genre.equalsIgnoreCase("children")) {
                    books[i] = new ChildrenBook(title, ISBN, publisher, price, year);
                    break;
                } else {
                    System.out.println("Invalid genre. Please choose either 'science' or 'children'.");
                }
            }
        }
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
