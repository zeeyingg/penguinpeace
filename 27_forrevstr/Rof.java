// Ziying Jian, Scruffy
// APCS
// HW27 -- FOR the Love of Strings
//2021-10-08
//time spent: 1.0 hour

/*
DISCO:
- .substring is used to print out a string from x to y, with x and y being int
- .substring() is a way of indexing in Java

QCC:
- What is the base case for reverseR()?
- How do we index individual characters in Java, like in Python s[i]. Is there a Java equivalent?

 */

public class Rof {

    public static String fenceF(int posts){
        String result = "|";
        for (int n = 1; n < posts; n++){
            result += "--|";
        } return result;
    }

    public static String reverseF (String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.substring(i, i+1);
        }
        return result;
    }

    public static String reverseR (String s){
        int i = s.length() - 1;
        String result = "";
        if (i >= 0){
            result = s.substring(i, i+1);
            return result + reverseR(s.substring(0, i));
        } return result;
    }

    public static void main(String[] args){
        System.out.println(fenceF(1));
        System.out.println(fenceF(3));
        System.out.println(reverseF("stressed") + "...should be desserts");
        System.out.println(reverseF("Ur face") + " ...should be ecaf rU");
        System.out.println(reverseR("stressed") + "...should be desserts");
        System.out.println(reverseR("Deez nuts") + "...should stun zeeD");
    }

}
