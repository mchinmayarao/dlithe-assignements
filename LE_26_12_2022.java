import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;


public class LE_26_12_2022 {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        sc.close();
        String[] elements = input.split(" ");
        for (String element : elements) {
            inputList.add(Integer.parseInt(element));
        }

        Map<Integer, Integer> elementCount = new HashMap<>();
        for (Integer element : inputList) {
            if (elementCount.containsKey(element)) {
                elementCount.put(element, elementCount.get(element) + 1);
            } else {
                elementCount.put(element, 1);
            }
        }

        List<Integer> sortedElements = new ArrayList<>(elementCount.keySet());
        sortedElements.sort((e1, e2) -> elementCount.get(e2) - elementCount.get(e1));

        
        System.out.println(sortedElements.stream().sorted().collect(Collectors.toList()));
        
    }
}
