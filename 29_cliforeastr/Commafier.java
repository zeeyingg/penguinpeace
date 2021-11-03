// Team Up2U (Ziying Jian + Scruffy, Emily Ortiz + Applesauce, Kartik Van + Krrish)
// APCS
// HW29 -- Which Way Do You Roll?
// 2021-11-2
// time spent: 1 hr

/*
DISCO:
- .length() only works with Strings
- Integer.toString(n), String.valueOf(n), and "" + n are all methods to convert ints to String

QCC:
- Does java take the absolute value of encoded expressions?
- Can you return a substring without specifying the parameters?

 */

public class Commafier {

    // BIG PROPS TO FAIZA AND NACHO PACHO FOR GIVING US PERMISSION TO USE THIS <3
    public static String commafyF(int n){
        String output = "";
        String nStr = Integer.toString(n); // convert int to String
        int strLen = nStr.length();
        for(int i = 0; i < strLen; i++){
            output += nStr.charAt(i); // 1
            if((strLen - i) % 3 == 1 && (i != (strLen - 1))){
                output += ",";
            }
        }
        return output;
    }

    public static String commafyR(int n) {
        if (n < 1000) {
            return "" + n;
        } else {
            int last3 = n % 1000;
            if (last3 < 10) {
                return commafyR(n / 1000) + "," + "00" + last3;
            } else if (last3 < 100) {
                return commafyR(n / 1000) + "," + "0" + last3;
            } else {
                return commafyR(n / 1000) + "," + last3;
            }
        }
    }

    public static void main(String[] args) {
        for (String arg : args){
            int intArg = Integer.parseInt(arg);
            System.out.println(commafyR(intArg));
            System.out.println(commafyF(intArg));
            }
        }
    }



