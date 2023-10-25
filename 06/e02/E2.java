import java.util.Scanner;

class E2 {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna koko:");
        int koko = lukija.nextInt();
        lukija.nextLine();

        char [] taulukko = new char [koko];

        System.out.println("Anna merkit:");
        for (int i = 0; i < koko; i++) {
            taulukko [i] = lukija.nextLine().charAt(0);
        }

        for (int i = 0; i < koko; i++) {
            System.out.print(taulukko[i]);
        }
        
        System.out.println("");
        lukija.close();
    }
}
