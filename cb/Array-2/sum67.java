public class sum67 {

/* Return the sum of the numbers in the array, except ignore sections
of numbers starting with a 6 and extending to the next 7 (every 6 will
be followed by at least one 7).  Return 0 for no numbers. */

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean go = true;
        int i = 0;
        while (i < nums.length) {
            if (go) {
                if (nums[i] == 6){
                    go = false;
                } else {
                    sum +=  nums[i];
                }

            } else {
                if (nums[i] == 7){
                    go = true;
                }
            }
            i += 1;

        }return sum;
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 2};
        int[] bill = {1, 2, 2, 6, 99, 99, 7};
        int[] richard = {1, 1, 6, 7, 2};
        System.out.println(sum67(bob) + "...expecting 5");
        System.out.println(sum67(bill) + "...expecting 5");
        System.out.println(sum67(richard) + "...expecting -3");
    }
}
