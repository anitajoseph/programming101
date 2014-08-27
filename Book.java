package libbooks;

/**
 * Created by anita.joseph on 11/08/2014.
 */
public class Book {
    private String name;
    private String author;
    private boolean available;

    public Book(String name, String author, boolean available){
        this.name = name;
        this.author = author;
        this.available = true;
    }

    public boolean isAvailable(){
      return this.available;
    }

    public void returned(){
        this.available = true;
    }

    public void borrowed(){
        this.available = false;
     }

    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
}



