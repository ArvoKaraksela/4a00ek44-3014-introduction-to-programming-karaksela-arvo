/**
 * TestRectangle sisältää main-metodin, joka luo Rectangle-olion ja tulostaa sen leveyden ja korkeudenö.
 * @author Arvo Karaksela
 */
public class TestRectangle {
    /**
     * main-metodi luo Rectangle-olion ja tulostaa sen korkeuden ja leveyden.
     * @param args
     */

    public static void main (String [] args) {
        Rectangle a = new Rectangle(); // Luodaan rectangle-olio 'a'
        Rectangle b = a;
        a.width = 5;
        a.height = 10;
        System.out.println(a.width); // Tulostetaan leveys
        System.out.println(a.height); // Tulostetaan korkeus
        System.out.println(a); // Tulostaa Rectangle@251a69d7
        System.out.println(b); // Tulostaa Rectangle@251a69d7
        System.out.println(a.width); // Tulostetaan leveys
        System.out.println(a.height); // Tulostetaan korkeus
    }
}
