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
        System.out.println(a.width); // Tulostetaan leveys
        System.out.println(a.height); // Tulostetaan korkeus
        // 'a'-olion attribuutit ovat 0, koska niitä ei ole alustettu.
    }
}