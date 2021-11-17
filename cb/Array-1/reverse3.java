import java.util.Arrays;

public class reverse3 {

    public static int[] reverse3(int[] nums) {
            int[] newNums = { nums[2], nums[1], nums[0]};
            return newNums;
        }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3};
        int[] bill = {5, 11, 9};
        int[] richard = {7, 0, 0};
        System.out.println(Arrays.toString(reverse3(bob)) + "...expecting [2, 3, 1]");
        System.out.println(Arrays.toString(reverse3(bill)) + "...expecting [9, 11, 5]");
        System.out.println(Arrays.toString(reverse3(richard)) + "...expecting [0, 0, 7]");
    }
}
