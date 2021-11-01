public class xyzThere {
    public static boolean xyzThere(String str) {
        String xyz = "xyz";
        if (str.length() >= 3 && str.substring(0, 3).equals(xyz)) {
            return true;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            String extract = str.substring(i, i + 3); // extracts three letters
            if (extract.equals(xyz) && !str.substring(i - 1, i).equals(".")) {
                // extract = "xyz" AND letter preceding it ISN'T a period
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(xyzThere( "abcxyz" + "...should be true"));
        System.out.println(xyzThere("abc.xyz" + "...should be false"));
        System.out.println(xyzThere("xyz.abc" + "...should be true"));
    }
}