public class firstLast6 {

/*  Given an array of ints, return true if 6 appears as either the first or last element in the array. */
    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 | nums[nums.length - 1] == 6) ;
    }

    public static void main(String[] args){
        int[] bob = {1, 2, 6};
        int[] bill = {6, 1, 2, 3};
        int[] richard = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(bob) + "...expecting true");
        System.out.println(firstLast6(bill) + "...expecting true");
        System.out.println(firstLast6(richard) + "...expecting false");
    }
}
