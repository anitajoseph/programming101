import java.util.*;

public class MainLib {

	public static void main(String[] args){
		System.out.println("Welcome to the library");

		
		Library library = new Library();
		library.addBook("Pride and Predjudice", "Jane Austen");
		library.addBook("Mansfield Park", "Jane Austen");
		library.addBook("BFG", "Roald Dahl");


		boolean isBFGAvailable = library.isBookWithNameAvailable("BFG");
		System.out.println("BFG availability is " + isBFGAvailable);

		//checks book which exists is available

		boolean isGoneWithTheWindAvailable = library.isBookWithNameAvailable("Gone with the wind");
		System.out.println("Gone with the Wind availability is " + isGoneWithTheWindAvailable);	

		//checks book which doesn't exist is available

		library.removeBook("BFG");
		System.out.println("BFG has been removed");

		//Removes the book

		isBFGAvailable = library.isBookWithNameAvailable("BFG");
		System.out.println("BFG availability is " + isBFGAvailable);

		//re-checks book is available

		System.out.println("Books in the library are ");
		ArrayList<String> titles = library.getAllTitles();
		for (int i=0; i<titles.size(); i++){
			System.out.println(titles.get(i));
		}

	}
	//homework to borrow book from library
	//add 10 books, borrrow two books, functionality to borrow, view available books, try to 
	//borrow a book that is unavailable

}


