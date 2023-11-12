import java.util.Scanner;
/**
 *  Ohjelma joka laskee lukujen 1 + 2 + 3 + ... + n summan, missä n on käyttäjän antama luku.
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi
     * @param args
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        // Kysytään käyttäjältä luku.
        System.out.println("Anna luku: ");
        int n = scanner.nextInt();

        int summa = 0;

        for (int i = 1; i <= n; i++) {
            summa += 1;
        }

        System.out.println(summa);
        scanner.close();
    }
}
