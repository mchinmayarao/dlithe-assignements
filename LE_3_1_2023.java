
import java.util.Scanner;

import java.util.*;
 

public class LE_3_1_2023{
    public static void main(String ... a){
        Stack<Character> stack = new Stack();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        boolean flag = true;
        for( int i =0; i<s.length(); i++){
            if (s.charAt(i) == '(')
			stack.push(')');
		else if (s.charAt(i) == '{')
			stack.push('}');
		else if (s.charAt(i) == '[')
			stack.push(']');
		else if (stack.pop() != s.charAt(i)){
			flag = false;
            break;
        }

        }
        if(flag)
            System.out.println("true");
        else 
            System.out.println("false");
    }    

}