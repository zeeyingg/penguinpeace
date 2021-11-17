public class lucky13 {

// Given an array of ints, return true if the array contains no 1's and no 3's.
    public static boolean lucky13(int[] nums) {
        boolean OnesOrThrees = true;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1 || nums[i] == 3) {
                OnesOrThrees = false;
            }
        }
        return OnesOrThrees;
    }

    public static void main(String[] args) {
        int[] bob = {0, 2, 4};
        int[] bill = {1, 2, 3};
        int[] richard = {1, 2, 4};
        System.out.println(lucky13(bob) + "...expecting true");
        System.out.println(lucky13(bill) + "...expecting false");
        System.out.println(lucky13(richard) + "...expecting false");
    }
}
