/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myworld;

import java.util.Scanner;

/**
 *
 * @author 014099
 */
public class MyWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Hallo Wereld");
    int toegangsprijs;
    int leeftijd = 5;

    if (leeftijd<18){
        toegangsprijs = 5;  
    } else {
        toegangsprijs = 10;
}
        System.out.println("de toegangsprijs is : "+toegangsprijs);
    
           Scanner input = new Scanner(System.in);
        
        int k=0;
        int l=0;
        System.out.print("Wat is getal1 ? ");
        k = input.nextInt();
        System.out.print("Wat is getal2 ? ");
        l = input.nextInt();
        
        System.out.println(k+l);
        System.out.print("wat is je naam ? "+naam) ;
        System.out.println(naam);
    }
}

