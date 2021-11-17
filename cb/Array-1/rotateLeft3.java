import java.util.Arrays;

public class rotateLeft3 {

/* Given an array of ints length 3, return an array with the elements
"rotated left" so {1, 2, 3} yields {2, 3, 1}. */

    public static int[] rotateLeft3(int[] nums) {
        int[] newNums = { nums[1], nums[2], nums[0]};
        return newNums;
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3};
        int[] bill = {5, 11, 9};
        int[] richard = {7, 0, 0};
        System.out.println(Arrays.toString(rotateLeft3(bob)) + "...expecting [2, 3, 1]");
        System.out.println(Arrays.toString(rotateLeft3(bill)) + "...expecting [11,, 9, 5]");
        System.out.println(Arrays.toString(rotateLeft3(richard)) + "...expecting [0, 0, 7]");
    }
}
