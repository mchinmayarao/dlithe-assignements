package Assignments;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class LE_11_1_2023 {
    public static void main(String ... a){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the no.of Elements: ");
        n = in.nextInt();

        int[] arr = new int[n];
       System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++)  
        {  
            arr[i]=in.nextInt();          
        }  

        int count = 0;  
          
         
        for(int i = 0 ; i < n; i++)  
        {  
              
            for(int j = 0; j < n; j++)  
            {  
                if(arr[i] == arr[j])  
                {  
                    count = count + 1;  
                }  
            }  
              
           
            if(count > n / 2)  
            {  
                System.out.print(arr[i]);
                break;
            }  
               
            count = 0;  
        }  
    }  
}

