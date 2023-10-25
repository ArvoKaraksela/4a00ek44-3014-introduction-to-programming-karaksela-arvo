package homework.ROBIN.e04;

/**
 * Ohjelma joka käyttää for-silmukoita lukujen tulostamiseen.
 * 
 * @author Arvo Karaksela
 */
public class Main {
    /**
     * Ohjelman päämetodi
     * @param args
     */
    public static void main(String [] args) {
        // Tulostaa luvut 1-15
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Tulostaa luvut 15-1
        for (int j = 15; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
