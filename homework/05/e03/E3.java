class E3 {
    public static void main(String [] args) {
        System.out.println("Anna nimi:");
        String nimi = System.console().readLine();
        tulostaJokinNimi(nimi);
    }
    
    public static void tulostaJokinNimi(String nimi) {
        System.out.println(nimi);
    }
}