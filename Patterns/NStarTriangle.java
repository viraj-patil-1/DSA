import java.util.Scanner;

public class NStarTriangle {
        public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        nStarTriangle(n);
    }

    public static void nStarTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
