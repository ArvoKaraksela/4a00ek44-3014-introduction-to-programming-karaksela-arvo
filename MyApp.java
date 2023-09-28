public class MyApp {
    public static void main(String[] args) {
        // printataan "Annna nimesi:"
        System.out.println("Anna nimesi:");
        // Tallennetaan käyttäjän syöte
        String nimi = System.console().readLine();
        
        int i = 0;
        // Printataan käyttäjän syöttämän nimen kirjaimet allekkain
        while (i < nimi.length()) { 
            System.out.println(nimi.charAt(i));
            i++;
        }
    }
}