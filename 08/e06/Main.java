import java.util.Scanner;
/**
 * Ohjelma jossa käyttäjältä kysytään kaksi lukua ja tulostetaan luvut niiden välistä.
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi
     * @param args
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        // Kysytään käyttäjältä ensimmäinen luku.
        System.out.println("Anna ensimmäinen luku: ");
        int num1 = scanner.nextInt();
        // Kysytään käyttäjältä toinen luku.
        System.out.println("Anna toinen luku: ");
        int num2 = scanner.nextInt();
        // Tarkistetaan että num1 on <= kuin num2.
        if (num1 <= num2) {
            System.out.println();
            // Tulostetaan luvut syötettyjen lukujen väliltä.
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
