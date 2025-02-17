
import java.util.Scanner;

public class Nby2Forest {

    public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        nForest(n);
    }

    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
