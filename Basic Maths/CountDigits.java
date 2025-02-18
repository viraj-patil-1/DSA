// https://www.naukri.com/code360/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int n;
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }
        countDigits(n);
    }

    public static int countDigits(int n){
        int num = n;
        int tempNum = 0;
        int count = 0;

        while(num>0){
            tempNum = num%10; 
            num = num/10; 
            if(tempNum != 0){
            if(n % tempNum == 0){
                count++;
            }
        }
            System.out.println(count);
        }
        return count;
    }
}
