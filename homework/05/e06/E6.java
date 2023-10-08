class E6 {
    public static void main(String [] args) {
        // Määritetään merkiksi X ja merkkien määräksi 3.
        char merkki = 'X';
        int määrä = 3;
        // Kutsutaan palautus-metodia.
        palautus(merkki, määrä);
    }   

    public static String palautus(char merkki, int määrä) {
        // Tulostetaan merkki 3 kertaa käyttäen for-looppia.
        for (int i = 0; i < määrä; i++) {
            System.out.print(merkki);
        }
        System.out.println("");
        return null;
    }
}
