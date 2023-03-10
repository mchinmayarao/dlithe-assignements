import java.util.HashMap;

public class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = map.get(s.charAt(i));
            if (i + 1 < s.length() && currentValue < map.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String roman = "XLV";
        int integer = romanToInt(roman);
        System.out.println(integer);
    }
}
