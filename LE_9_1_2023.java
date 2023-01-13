package Assignments;
import java.util.Scanner;

public class LE_9_1_2023 {
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
        
        
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
  
    public static void main(String ... a)  
    {  
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();  
        int result = num;  
        
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
        }  
        
        
        if(result == 1)  
            System.out.println("True");  
        
        else if(result == 4)  
            System.out.println("False");
    }
}
