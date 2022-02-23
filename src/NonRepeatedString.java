// Print the first non-repeated character from a string? Example: ramchandra.

public class NonRepeatedString {
    public static void main (String[] args) {
        String string = "ramchandra";
        for (int i=0; i<string.length();) {
            String text = Character.toString(string.charAt(i));
            if (string.indexOf(text) == string.lastIndexOf(text)) {
                System.out.println("Non repeated character in string is: " + text);
                break;
            } else {
                i++;
            }
        }
    }
}
