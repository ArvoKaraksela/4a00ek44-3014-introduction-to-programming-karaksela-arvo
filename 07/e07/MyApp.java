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

        printTwoDimArray(arr);
        int max = MaxValue(arr);
        System.out.println(max);
    }

    public static void printTwoDimArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int MaxValue(int[][] arr) {
        int max = arr [0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
