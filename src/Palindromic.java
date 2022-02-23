//  find the longest palindromic substring in a given string? Example string: csbcjfbvbvfjcb


public class Palindromic {

public static void main(String[] Args) {

    String name = "csbcjfbvbvfjcb";
    String temp="",rev="";

    System.out.println(name.length());
    System.out.println(name);
     for(int i=name.length()-1; i >= 0; i--){
         rev += name.charAt(i);
     }
    System.out.println("reverse = " +rev);


    for(int j = 0; j<=name.length()-1;){
        for(int k=0; k <=name.length()-1;){
            if (name.charAt(j) == rev.charAt(k)) {
                temp += name.charAt(j);
                j++;
                k++;
            } else {
                j++;
                k++;
            }

        }
     }
    System.out.println(temp);

    }

}
