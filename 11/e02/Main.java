
class Main {
    public static void main(String [] args) {
        String text = "lintu syntyi";

        class Bird {
            public Bird() {
                System.out.println(text);
            }
        }
        new Bird();
    }
}