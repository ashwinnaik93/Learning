// How do you find the length of the longest substring without repeating characters?

import java.util.HashMap;

public class LongestSubString {

    public static void main(String[] Args) {
        String string = "abcdfde";
        System.out.println("Length of the longest substring is: " + subStringLength(string));
    }

    public static int subStringLength (String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0, length=0;
        while (right < str.length()){
            if (map.containsKey(str.charAt(right))) {
                left = Math.max(map.get(str.charAt(right)) + 1, left);
            }
            map.put(str.charAt(right), right);
            length = Math.max(length, right - left + 1);
            right++;
        }
        System.out.println(map.keySet());
        System.out.println(map);
        return length;
    }
}