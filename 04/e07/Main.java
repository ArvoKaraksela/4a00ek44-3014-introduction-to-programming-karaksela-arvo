public class Main {
    public static void main(String [] args) {
        String taulukko [] = {"Tupu", "Hupu", "Lupu", "Hessu Hopo", "Aku Ankka"};
        for (int i = 0; i < taulukko.length; i += 2) {
            System.out.println(taulukko[i]);
        } 
    }
}