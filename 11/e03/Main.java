
class Bird {
    public void lennä() {
        System.out.println("lintu lentää");
    }
}

class Main {
    public static void main(String [] args) {
        Bird lintu = new Bird();
        lennä(lintu);

        class Struhtioniformes extends Bird {
            @Override
            public void lennä() {
                System.out.println("Strutsi yrittää lentää");
            }
        }
        Struhtioniformes strutsi = new Struhtioniformes();
        lennä(strutsi);
    }
    public static void lennä(Bird b) {
        b.lennä();
    }
}
