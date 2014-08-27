package libbooks;
import java.util.*;
/**
 * Created by anita.joseph on 11/08/2014.
 */

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }
    //method to add books
    public void addBook(String name, String author, boolean available){
        Book book = new Book(name, author, available);
        books.add(book);
    }

    //method to get all titles of the books in to an array called titles
    public ArrayList<String> getAllTitles () {
        ArrayList<String> titles = new ArrayList<String>();
        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            titles.add(book.getName());

        }
        return titles;
    }

    //find the book in the list, cycle to end of list and THEN remove it.
    public void removeBook(String name){
        int positionOfBookToRemove = -1;

        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            if(book.getName().equals(name)){
                positionOfBookToRemove = i;

            }
        }

        if (positionOfBookToRemove > -1) {
            books.remove(positionOfBookToRemove);
        }

    }

    //method to check if books are available
    public boolean isBookWithNameAvailable(String name){

        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            if (book.getName().equals(name)){
                return book.isAvailable();
                }
        }

        return false;
    }


    //borrow book
    public void borrowBook(String name) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name)) {
                book.borrowed();
            }
        }
    }


    //return book
    public void returnBook(String name){
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(name)) {
                book.returned();

            }
        }
    }

}

