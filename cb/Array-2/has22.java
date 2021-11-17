public class has22 {

// Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 2 && i < nums.length - 1 && nums[i+1] == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 2};
        int[] bill = {1, 2, 1, 2};
        int[] richard = {2, 1, 2};
        System.out.println(has22(bob) + "...expecting true");
        System.out.println(has22(bill) + "...expecting false");
        System.out.println(has22(richard) + "...expecting false");
    }
}
