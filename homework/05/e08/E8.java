import java.util.Scanner;

class E8 {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        // Määritetään merkiksi X ja kysytään merkkien korkeus käyttäjältä.
        char merkki = 'X';
        System.out.println("Anna kuvion korkeus:");
        int korkeus = lukija.nextInt();
        // Kutsutaan palautus-metodia.
        palautus(merkki, korkeus);
        lukija.close();
    }   
    
    public static String palautus(char merkki, int korkeus) {
        // Tulostetaan merkki n kertaa käyttäen for-looppia.
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < korkeus; j++) {
                System.out.print(merkki + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        return null;
    }
}
