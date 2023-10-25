
class MyApp {
    public static void main(String [] args) {
        // Tulostaa 'x' merkin 3 kertaa.
        System.out.println( toista('x', itseisarvo(-3)) );
        // Tulostaa 'a' merkin 4 kertaa.
        System.out.println( toista('a', itseisarvo(4)) );
    }
    // Ottaa vastaan merkin ja määrän ja palauttaa merkin x määrä.
    public static String toista(char merkki, int määrä) {
        String tulos = "";
        for (int i = 0; i < määrä; i++) {
            tulos += merkki;
        }
        return tulos;
    }
    // Ottaa vastaan luvun ja palauttaa itseisarvon.
    public static int itseisarvo(int luku) {
        // Tarkistetaan onko luku negatiivinen vai ei.
        if (luku < 0) {
            return -luku;
        } else {
            return luku;
        }
    }
}
