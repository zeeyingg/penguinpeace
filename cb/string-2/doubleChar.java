public class doubleChar {
    public static String doubleChar(String str) {
        String extract = "";
        for (int i = 0; i <= str.length() - 1; i++){
            extract = extract + str.substring(i, i+1) + str.substring(i, i+1);
        } return extract;
    }

    public static void main(String[] args){
        System.out.println(doubleChar("The") + " ...should be TThhee");
        System.out.println(doubleChar("AAbb") + " ...should be AAAAbbbb");
        System.out.println(doubleChar("Hi-There") + " ...should be HHii--TThheerree");
    }
}
