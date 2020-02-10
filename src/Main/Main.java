package Main;
import chocolates.Chocolates;
import chocolates.Dairymilk;
import chocolates.Kitkat;
import chocolates.Milkybar;
import gift.Gift;
import sweets.Sweets;
import sweets.Kheerkadam;
import sweets.Milkcake;
import sweets.Sonpapdi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        Chocolates c1=new Dairymilk("Dairy Milk bubbly",160,50);
        Chocolates c2=new Kitkat("Kitkat",45,35);
        Chocolates c3=new Milkybar("Milkybar White Chocolate",15,10);
        Sweets s1=new Kheerkadam("Kheerkadam",450,300);
        Sweets s2=new Sonpapdi("Sonpapdi",150,500);
        Sweets s3=new Milkcake("Milkckae",300,100);
        Gift gift=new Gift();
        gift.addChocolates(c1,c2,c3);
        gift.addSweets(s1,s2,s3);
        gift.sort();
        
        do
        {
            System.out.println("Enter '1' to view candies : ");
            System.out.println("Enter '2' to view sweets : ");
            System.out.println("Enter '3' to know expensive chocolates and sweets : ");
            System.out.println("Enter '3' to know expensive chocolates and sweets : ");
            System.out.println("Enter '4' to view the total weight");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("chocolates List in sorted order by price....");
                ArrayList<Chocolates> arrayList=gift.getChocolates();
                for (Chocolates c:arrayList) {
                    System.out.println(c.toString());
                }
                
                break;
                case 2:
                System.out.println("Sweets List in sorted order by price....");
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+expensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+expensive(gift.getSweets()));
                break;
                case 4:
                	System.out.println("Total Weight : "+gift.totalWeight());
                	break;
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        while(choice < 5);
        io.close();
    }
	private static <T> String expensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
    
    

    		
    
    
    
}