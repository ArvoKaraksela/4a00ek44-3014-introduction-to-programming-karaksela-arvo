/**
 * Luokka Ihminen kuvaa ihmisen toimintoja.
 * @author Arvo Karaksela
 */
class Ihminen {
    private String nimi;

    public Ihminen() {
        this.nimi = "Arvo";
    }

    public Ihminen(String n) {
        this.nimi = n;
    }
    /**
     * Asettaa nimen.
     * @param n Henkilön nimi.
     */
    public void setNimi(String n) {
        this.nimi = n;
    }
    /**
     * Nimen palautus.
     * @return Palauttaa nimen.
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * Ihminen nukkuu.
     */
    public void nuku() {
        System.out.println(getNimi() + " nukkuu");
    }
    /**
     * Ihminen syö.
     */
    public void syo() {
        System.out.println(getNimi() + " syö");
    }
    /**
     * Ihminen juo.
     */
    public void juo() {
        System.out.println(getNimi() + " juo");
    }
    /**
     * Ihminen lisääntyy.
     */
    public void lisaanny() {
        System.out.println(getNimi() + " lisääntyy");
    }
}
/**
 * Luokka ohjelmoija perii Ihmisen ja lisää sille toimintoja.
 */
class Ohjelmoija extends Ihminen {

    public Ohjelmoija(String n) {
        super(n);   
    }
    /**
     * Ohjelmoija osallistuu juhlaan.
     */
    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println(getNimi() + " osallistuu CyberGothDance -juhlaan");
    }
    /**
     * Ohjelmoija ohjelmoi.
     */
    public void ohjelmoi() {
        System.out.println(getNimi() + " ohjelmoi");
    }
}

public class Testi {
    public static void main (String [] args) {
        Ihminen henkilo1 = new Ihminen("Jeppe");
        Ihminen henkilo2 = new Ihminen();
        Ohjelmoija ohjelmoija = new Ohjelmoija("Pekka");
        // Asettaa nimet.
        henkilo1.setNimi("Cristiano Ronaldo");
        henkilo2.setNimi("Teemu Selänne");
        ohjelmoija.setNimi("Arvo");
        // Kutsuu ja tulostaa toimintoja.
        henkilo1.syo();
        henkilo2.juo();
        henkilo1.nuku();
        henkilo2.lisaanny();
        ohjelmoija.ohjelmoi();
        ohjelmoija.osallistuCyberGothDanceJuhlaan();
        
    }
}
