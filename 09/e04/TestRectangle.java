/**
 * @author Arvo Karaksela
 */
public class TestRectangle {
    /**
     * 
     * @param args
     */

    public static void main (String [] args) {
        Rectangle a = new Rectangle(); // Luodaan rectangle-olio 'a'
        a.whoAmI(); // Kutsutaan whoAmI-metodia olion 'a' kautta.
        // this viittaa 'a' olioon. Tulostaa Rectangle@251a69d7
    }
}
