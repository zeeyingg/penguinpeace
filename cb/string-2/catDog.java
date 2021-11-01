public class catDog {

    public static boolean catDog(String str) {
            int catCount = 0;
            int dogCount = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                String cat = str.substring(i, i + 3);
                String dog = str.substring(i, i + 3);
                if (cat.equals("cat")) {
                    catCount++;
                } else if (dog.equals("dog")) {
                    dogCount++;
                }
            }
            if (catCount == dogCount) {
                return true;
            }
            return false;
        }

    public static void main(String[] args){
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
    }
}


