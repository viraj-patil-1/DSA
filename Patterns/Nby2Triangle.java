import java.util.Scanner;

public class Nby2Triangle {
        public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        nTriangle(n);
    }

    public static void nTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
