import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        System.out.println("Hello World!! "+n);
    }
}
