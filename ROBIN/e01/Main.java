package homework.ROBIN.e01;

import java.util.Scanner;
/**
 * Pääluokka, joka lukee käyttäjältä luvun ja tarkistaa sen positiivisuuden.
 * 
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi.
     * @param args
     */
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ANNAPPA LUKU: ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();

        boolean result = MyMath.isPositive(number);
        
        System.out.println("Luku " + number + " on positiivinen: " + result);
    }
}