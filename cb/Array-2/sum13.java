public class sum13 {

/* Return the sum of the numbers in the array, returning 0 for an empty
array. Except the number 13 is very unlucky, so it does not count and
numbers that come immediately after a 13 also do not count. */

    public static int sum13(int[] nums) {
        int sum = 0;
        int i = 0;
        if(nums.length == 0){
            return sum;
        }
        while(i<nums.length){
            if(i==0 && nums[i]!=13){
                sum+=nums[i];
                i+=1;
            }
            else if(nums[i]==13||nums[i-1]==13){
                i+=1;
            }
            else{
                sum+=nums[i];
                i+=1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 2, 1};
        int[] bill = {1, 1};
        int[] richard = {1, 2, 2, 1, 13};
        System.out.println(sum13(bob) + "...expecting 6");
        System.out.println(sum13(bill) + "...expecting 2");
        System.out.println(sum13(richard) + "...expecting 6");
    }
}
