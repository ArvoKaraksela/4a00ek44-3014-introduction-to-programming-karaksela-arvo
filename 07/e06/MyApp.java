import java.util.Scanner;

class MyApp {
    public static void main(String [] args) {
        int rivi, sarake, i, j;
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä rivien määrä: ");
        rivi = lukija.nextInt();

        System.out.print("Syötä sarakkeiden määrä: ");
        sarake = lukija.nextInt();
        
        System.out.println("Syötä taulukon luvut: ");
        int arr[][] = new int[rivi][sarake];

        for (i = 0; i < rivi; i++) {
            for (j = 0; j < sarake; j++) {
                arr[i][j] = lukija.nextInt();
            }
        }
        System.out.println("Taulukon luvut: ");
        for (i = 0; i < rivi; i++) {
            for (j = 0; j < sarake; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        lukija.close();
    }
}
