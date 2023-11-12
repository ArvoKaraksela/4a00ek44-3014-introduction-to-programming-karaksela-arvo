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
        a.width = 5;
        a.height = 10;
        
        a.printMe();

    }
}
