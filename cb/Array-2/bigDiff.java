import com.sun.codemodel.internal.JCommentPart;

public class bigDiff {

/* Given an array length 1 or more of ints, return the difference between
the largest and smallest values in the array. */

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return (max - min);
    }

    public static void main(String[] args) {
        int[] bob = {10, 3, 5, 6};
        int[] bill = {7, 2, 10, 9};
        int[] richard = {2, 10, 7, 2};
        System.out.println(bigDiff(bob) + "...expecting 7");
        System.out.println(bigDiff(bill) + "...expecting 8");
        System.out.println(bigDiff(richard) + "...expecting 8");
    }
}
