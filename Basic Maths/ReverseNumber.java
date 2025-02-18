import java.util.Scanner;

public class ReverseNumber {
     public static void main(String[] args) {
        long n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextLong();
        }
        System.out.println(reverseBits(n));
        
    }

    public static long reverseBits(long n){
        long num = n;
        long tempNum;
        StringBuilder str = new StringBuilder("");

        while(num>0){
            tempNum = num%10; 
            num = num/10; 
            str.append(tempNum);
            
        }
        return Long.parseLong(str.toString());
    }
}
