//Find if a given string is substring of a given string. example: is dsa substring of vdfhdsabkf?

public class ExistingString {
    public static void main(String[] args) {
        String mainstring = "vdfhdsabkf", substring = "dsa";
        if (mainstring.contains(substring)) {
            System.out.println("Yes, " + substring + " is substring of " + mainstring);
        } else {
            System.out.println("No, " + substring + " is not a substring of " + mainstring);
        }
    }
}