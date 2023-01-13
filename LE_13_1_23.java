package Assignments;
import java.util.Scanner;

public class LE_13_1_23 {
    public static void main(String ... a){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter no.of elements:");
        n = in.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];  
          
        for(int i=0; i<n; i++)  
        {  
            arr[i]=in.nextInt();          
        }  

        int numSwaps = 0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                        numSwaps+=1;
                        arr[j -1] = (arr[j-1] + arr[j]) - (arr[j] = arr[j-1]);
                    }  
                     
            }  
        }
        
        System.out.println("Array is sorted in " + numSwaps + " swaps");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: "+ arr[n-1]);
        
    }
}
