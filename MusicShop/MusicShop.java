import java.util.*;
public class MusicShop {

    private ArrayList<SingleCD> listOfCds;

    public MusicShop() {
        listOfCds = new ArrayList<SingleCD>();
    }

    //method to add CDs
    public void addCD(String name, String artist, int price){
        SingleCD CD= new SingleCD(name, artist, price);
        listOfCds.add(CD);
    }

    public SingleCD getCheapestCDAvailable(){
    	for (int i=0; i<listOfCds.size(); i++){
        }

        return null;
           
    }

}

