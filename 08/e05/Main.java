import java.util.Scanner;
/**
 * Ohjelma pyytää käyttäjältä nimen ja varmistaa että nimi on vähintään kahden merkin mittainen.
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
        String name = "";
        
        while (name.length() < 2) {
            System.out.println("anna nimi");
            name = scanner.nextLine();
        }
        
        System.out.println("annoit nimen " + name);
        scanner.close();
    }
}
