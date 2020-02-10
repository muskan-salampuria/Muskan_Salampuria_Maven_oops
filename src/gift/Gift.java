package gift;
import chocolates.Chocolates;
import sweets.Sweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
	private ArrayList<Chocolates> chocolates;
    private ArrayList<Sweets> sweets;

    public Gift(){
        chocolates=new ArrayList<>();
        sweets=new ArrayList<>();

}
    public void addChocolates(Chocolates... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweets... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public void sort(){
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }
    

    public ArrayList<Chocolates> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public int totalWeight(){
        int weight=0;

        for(Chocolates c: this.chocolates)
            weight+=c.getWeight();
        for(Sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }
}
