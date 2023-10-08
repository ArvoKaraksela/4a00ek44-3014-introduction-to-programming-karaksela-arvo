package e01;

import java.util.Scanner;

class E1 {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        int [] taulukko = new int [10];
        // Kysytään käyttäjältä 10 lukua ja tallennetaan ne taulukkoon
        for (int i = 0; i < 10; i++) {
            System.out.println("Syötä kokonaisluku:");
            taulukko [i] = lukija.nextInt();
        }

        System.out.println("Tässä taulukkosi:");
        // Tulostetaan arvot.
        for (int i = 0; i < 10; i++) {
            System.out.println(taulukko[i]);
        }
        
        lukija.close();
    }
}
