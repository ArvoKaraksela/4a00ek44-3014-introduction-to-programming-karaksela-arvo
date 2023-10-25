class E7 {
    public static void main(String [] args) {
        // Määritetään merkiksi X ja merkkien määräksi 3.
        String merkki = "X";
        int määrä = 3;
        // Kutsutaan palautus-metodia.
        palautus(merkki, määrä);
    }   

    public static String palautus(String merkki, int määrä) {
        // Tulostetaan merkki 3 kertaa käyttäen for-looppia.
        for (int i = 0; i < määrä; i++) {
            System.out.print(merkki);
        }
        System.out.println("");
        return null;
    }
}
