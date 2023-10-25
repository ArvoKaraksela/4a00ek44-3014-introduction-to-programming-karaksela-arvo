import java.util.Scanner;

public class MyApp {
    public static void main (String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä neliön korkeus: ");
        int korkeus = lukija.nextInt();

        char[][] neliö = teeNeliö(korkeus);
        printNeliö(neliö);

        lukija.close();
    }

    public static char [][] teeNeliö(int korkeus) {
        char [][] neliö = new char [korkeus][korkeus];

        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < korkeus; j++) {
                if (i == 0 || i == korkeus - 1 || j == 0 || j == korkeus - 1) {
                    neliö[i][j] = 'X';
                } else {
                    neliö[i][j] = ' ';
                }
            }
        }
        return neliö;
    }

    public static void printNeliö(char[][] neliö){
        for (int i = 0; i <  neliö.length; i++) {
            for (int j = 0; j < neliö[i].length; j++) {
                System.out.print(neliö[i][j]);
            }
            System.out.println();
        }
    }
}
