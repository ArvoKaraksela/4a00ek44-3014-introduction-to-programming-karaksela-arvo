import java.io.Console;

public class MyApp {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna luku 1:");
        int luku1 = Integer.parseInt(c.readLine());

        System.out.println("Anna luku 2:");
        int luku2 = Integer.parseInt(c.readLine());

        if (luku1 <= luku2) {
            for (int i = luku1; i <= luku2; i++) {
                System.out.println(i);

            }
        }
    }
}