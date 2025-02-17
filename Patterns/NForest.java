
import java.util.Scanner;

public class NForest {
    public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        nForest(n);
    }

    public static  void nForest(int n) {
        for(int i = 0 ; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
     }
}

