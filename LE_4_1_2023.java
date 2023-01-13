package Assignments;
import java.util.Scanner;
public class LE_4_1_2023 {
    public static int lengthOfLastWord( String a)
    {
        int len = 0;
 
        String x = a.trim();
 
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
 

    public static void main(String ... args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(lengthOfLastWord(str));
    }
}
