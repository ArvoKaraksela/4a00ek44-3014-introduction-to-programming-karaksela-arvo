package homework.ROBIN.e03;

/**
 * Ohjelma joka käyttää while-silmukoita lukujen tulostamiseen.
 * 
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi
     * @param args
     */
    public static void main(String [] args) {
        int i = 2;
        // Tulostaa luvut 2-12.
        while (i <= 12) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Rivinvaihto

        i = 12;
        // Tulostaa luvut 12-2
        while (i >= 2) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println(); // Rivinvaihto
    }
}
