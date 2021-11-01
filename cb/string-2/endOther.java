public class endOther {

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String str = b;
        String shorter = a;
        if (a.length() > b.length() ){
            str = a;
            shorter = b;
        }

        int shortLength = shorter.length()-1;
        int stringLength = str.length() - 1;
        String stringExtract = str.substring(stringLength - shortLength);
        if ( stringExtract.equals(shorter) ){
            return true; }
        return false;
    }

    public static void main(String[] args){
        System.out.println(endOther("Hiabc", "abc") + "...should be true");
        System.out.println(endOther("AbC", "HiaBc") + "...should be true");
        System.out.println(endOther("abc", "abXabc") + "...should be true");
    }

}
