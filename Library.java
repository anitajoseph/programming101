import java.util.*;

//imports java utility package. see sep doc from sully

public class Library {

	private ArrayList<Book> books;

	public Library() {
		books = new ArrayList<Book>();
	}

	public void addBook(String name, String author){
		Book book = new Book(name, author);
		books.add(book);
	}

	public ArrayList<String> getAllTitles () {
			ArrayList<String> titles = new ArrayList<String>();
			for (int i=0; i<books.size(); i++){
				Book book = books.get(i);
				titles.add(book.getName());

				}

			return titles;
	}

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

		//find the book in the list, cycle to end of list and THEN remove it.		
	}

	public boolean isBookWithNameAvailable(String name){

		for (int i=0; i<books.size(); i++){
			Book book = books.get(i);
			if (book.getName().equals(name)){
				return true;
			}
		}

		return false;
	}
}

