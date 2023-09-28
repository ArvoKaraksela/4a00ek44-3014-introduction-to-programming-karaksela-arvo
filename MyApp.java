public class MyApp {
    public static void main(String[] args) {
        
        System.out.println("Anna nimesi:");
        String nimi = System.console().readLine();

        int i = nimi.length() - 1;
        while (i >= 0)  { 
            System.out.println(nimi.charAt(i));
            i--;
        }
    }
}