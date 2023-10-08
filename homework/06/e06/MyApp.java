
class MyApp {
    public static void main(String [] args) {
        System.out.println( toista('x', itseisarvo(-3)) );
        System.out.println( toista('a', itseisarvo(4)) );
    }

    public static String toista(char merkki, int määrä) {
        String tulos = "";
        for (int i = 0; i < määrä; i++) {
            tulos += merkki;
        }
        return tulos;
    }

    public static int itseisarvo(int luku) {
        if (luku < 0) {
            return -luku;
        } else {
            return luku;
        }
    }
}
