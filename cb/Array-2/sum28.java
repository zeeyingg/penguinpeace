public class sum28 {

    public static boolean sum28(int[] nums) {
        int total = 0;
        int twoListIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 2){
                total = nums[i] + total;
            }

        }
        if (total == 8){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] bob = {2, 3, 2, 2, 4, 2};
        int[] bill = {2, 3, 2, 2, 4, 2, 2};
        int[] richard = {1, 2, 3, 4};
        System.out.println(sum28(bob) + "...expecting true");
        System.out.println(sum28(bill) + "...expecting false");
        System.out.println(sum28(richard) + "...expecting false");
    }
}
