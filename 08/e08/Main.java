import java.util.Scanner;
/**
 *  Ohjelma joka kysyy käyttäjältä positiivisia kokonaislukuja ja laskee niiden keskiarvon.
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi
     * @param args
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int luku;
        int määrä = 0;

        do {
            System.out.println("Syötä luku: ");
            luku = scanner.nextInt();

            if (luku >= 0) {
                summa += luku;
                määrä++;
            }
        } while (luku >= 0);
        
        if (määrä > 0) {
            double keskiarvo = (double) summa / määrä;
            System.out.println("Keskiarvo on: " + keskiarvo);
        }
        scanner.close();
    }
}
