// Print the first non-repeated character from a string? Example: ramchandra.

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedString {

    public static void main(String[] args) {
        String string = "ramchandra";
        System.out.println("First non-repeated character is: " + firstNotRepeatedCharter(string));
    }

    public static char firstNotRepeatedCharter(String string) {
        char nonRepetingChar = 0;
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (hashMap.containsKey(string.charAt(i))) {
                hashMap.put(string.charAt(i), hashMap.get(string.charAt(i)) + 1);
            } else {
                hashMap.put(string.charAt(i), 1);
            }
        }
        System.out.println(hashMap);
        for (Map.Entry<Character, Integer> value : hashMap.entrySet()) {
            if (value.getValue() == 1) {
                nonRepetingChar = value.getKey();
                break;
            }
        }
        return nonRepetingChar;
    }
}

