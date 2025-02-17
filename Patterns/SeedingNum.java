
import java.util.Scanner;

public class SeedingNum {

    public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        nNumberTriangle(n);
    }

    public static void nNumberTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
