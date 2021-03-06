public class sameFirstLast {

/*  Given an array of ints, return true if the array is length 1 or more,
and the first element and the last element are equal.  */

    public static boolean sameFirstLast(int[] nums) {
    if (nums.length > 0) {
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
    }
    return false;
    }

    public static void main(String[] args){
        int[] bob = {1, 2, 3};
        int[] bill = {1, 2, 3, 1};
        int[] richard = {1, 2, 1};
        System.out.println(sameFirstLast(bob) + "...expecting false");
        System.out.println(sameFirstLast(bill) + "...expecting true");
        System.out.println(sameFirstLast(richard) + "...expecting true");
    }

}
