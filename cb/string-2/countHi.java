public class countHi {

    public static int countHi(String str) {
        int counter = 0;
        for (int i=0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("hi")) {
                counter++;
            }
        } return counter;
    }

    public static void main(String[] args){
        System.out.println(countHi("abc hi ho") + "...should be 1" );
        System.out.println(countHi("ABChi hi") + "...should be 2");
        System.out.println(countHi("hihi") + "...should be 2");
    }

}
