public class SingleCD {

    private String name;
    private String artist;
    private int price;

    public SingleCD(String name, String artist, int price){
    	this.name = name;
        this.artist = artist;
        this.price = price;
    }

     public String getName(){
        return this.name;
    }

    public String getArtist(){
        return this.artist;
    }

    public int getPrice(){
        return this.price;
    }

}