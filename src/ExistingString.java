//Find if a given string is substring of a given string. example: is dsa substring of vdfhdsabkf?

public class ExistingString {
    public static void main (String[] args) {
        String fullstring = "vdfhdsabkf", substring = "dsa";
        if (fullstring.contains(substring)) {
            System.out.println("Yes, " +substring +" is substring of " +fullstring);
        } else {
            System.out.println("No, " +substring +" is not a substring of " +fullstring);
        }
    }
}
