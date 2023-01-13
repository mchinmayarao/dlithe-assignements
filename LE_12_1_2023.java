package Assignments;
import java.util.Scanner;

public class LE_12_1_2023 {
    public static void main(String ... a){
        Scanner in = new Scanner(System.in);
        int n,d;
        n = in.nextInt();
        d = in.nextInt();

        int[] arr = new int[n];  
          
        for(int i=0; i<n; i++)  
        {  
            arr[i]=in.nextInt();          
        }  

        for(int i = 0; i < d; i++){
            int first = arr[0];  
            int j;
            for(j = 0; j < n-1; j++){   
                arr[j] = arr[j+1];  
            }  
            
            arr[j] = first;  
        }

        
        for(int i = 0; i< n; i++){  
            System.out.print(arr[i] + " ");  
        }
    }
}
