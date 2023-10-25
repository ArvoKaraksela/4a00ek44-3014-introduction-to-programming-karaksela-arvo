package homework.ROBIN.e02;

import java.util.Scanner;
/**
 * Ohjelma, joka lukee kaksi lukua käyttäjältä ja tarkistaa onko niiden summa 10.
 * 
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi.
     * @param args
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anna ensimmäinen luku: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Anna toinen luku: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println();

        if (num1 + num2 == 10) {
            System.out.println("se oli kymppi");
        } else {
            System.out.println("se ei ollut kymppi");
        }
        scanner.close();
    }
}
