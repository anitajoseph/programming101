package libbooks;
import java.util.*;

public class Main {


        public static void main(String[] arg) {

            System.out.println("Welcome to the Library");
            System.out.println("");

            Library library = new Library();
            library.addBook("Pride and Prejudice", "Jane Austen", false);
            library.addBook("Sherlok Holmes", "Arthur Doyle", false);
            library.addBook("BFG", "Roald Dahl", false);

            //checks book which exists is available
            boolean isBFGAvailable = library.isBookWithNameAvailable("BFG");
            System.out.println("BFG availability is:" + isBFGAvailable);

            //checks book which doesn't exist is available
            boolean isGoneWithTheWindAvailable = library.isBookWithNameAvailable("Gone With The Wind Available");
            System.out.println("Gone With The Wind availability is:" + isGoneWithTheWindAvailable);

            //Removes the book
            library.removeBook("BFG");
            System.out.println("BFG has been removed");

            //Borrow a book
            library.borrowBook("Pride and Prejudice");
            library.borrowBook("Sherlok Holmes");
            boolean isBookBorrowed = library.isBookWithNameAvailable("Sherlok Holmes");
            System.out.println("Availability of 'Sherlok Holmes' is: " + isBookBorrowed );

            //return book
            library.returnBook("Pride and Prejudice");
            boolean isBookReturned = library.isBookWithNameAvailable("Pride and Prejudice");
            System.out.println("Availability of 'Pride and Prejudice' is: " + isBookReturned );


            //print the names of the book in the library
            System.out.println("");
            System.out.println("Books in the library are ");
            ArrayList<String> titles = library.getAllTitles();
            for (int i=0; i<titles.size(); i++){
                System.out.println(titles.get(i));
            }
        }
    }

