public class countEvens {
    public static int countEvens(int[] nums) {
        int numEvens = 0;
        for (int x : nums) {
            if (x%2 == 0) {
                numEvens +=1;
            }
        }
        return numEvens;
    }

    public static void main(String[] args) {
        int[] bob = {2, 1, 2, 3, 4};
        int[] bill = {2, 2, 0};
        int[] richard = {1, 3, 5};
        System.out.println(countEvens(bob) + "...expecting 3");
        System.out.println(countEvens(bill) + "...expecting 3");
        System.out.println(countEvens(richard) + "...expecting 0");
    }

}
