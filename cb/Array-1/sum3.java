public class sum3 {

/*  Given an array of ints length 3, return the sum of all the elements. */
    public static int sum3(int[] nums) {
            return (nums[0] + nums[1] + nums[2]);
        }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3};
        int[] bill = {5, 11, 2};
        int[] richard = {7, 0, 0};
        System.out.println(sum3(bob) + "...expecting 6");
        System.out.println(sum3(bill) + "...expecting 18");
        System.out.println(sum3(richard) + "...expecting 7");
    }
}
