import java.util.Scanner;
class E5 {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        int luku1 = lukija.nextInt();
        System.out.println("Anna toinen luku:");
        int luku2 = lukija.nextInt();
        int tulos = laske(luku1, luku2);
        System.out.println("Tulos: " + tulos);
    }

    public static int laske(int luku1, int luku2) {
        int summa = luku1 + luku2;
        return summa;
        
    }
}
