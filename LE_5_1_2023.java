package Assignments;
import java.util.Scanner;
public class LE_5_1_2023 {
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
    
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
    
        return true;
    }
    
    public static int printPrime(int n){
        
        int count = 1;
    
        for (int i = 3; i < n; i++) {
            if (isPrime(i))
                count++;
        }
    
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(printPrime(n));
    }
}
