import java.util.Arrays;

public class maxEnd3 {

/* Given an array of ints length 3, figure out which is larger, the first
or last element in the array, and set all the other elements to be that
value. Return the changed array. */

    public static int[] maxEnd3(int[] nums) {
        int max;
        max = nums[0];
        if (nums[2] > max){
            max = nums[2];
        }
        return new int[] {max, max, max};
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3};
        int[] bill = {11, 5, 9};
        int[] richard = {2, 11, 3};
        System.out.println(Arrays.toString(maxEnd3(bob)) + "...expecting [3, 3, 3]");
        System.out.println(Arrays.toString(maxEnd3(bill)) + "...expecting [11, 11, 11]");
        System.out.println(Arrays.toString(maxEnd3(richard)) + "...expecting [3, 3, 3]");

    }
}
