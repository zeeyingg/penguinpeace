public class centeredAverage {

/* Return the "centered" average of an array of ints, which we'll say is
the mean average of the values, except ignoring the largest and smallest
values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int
division to produce the final average. You may assume that the array is
length 3 or more. */
    public static int centeredAverage(int[] nums) {
        int max = 0;
        int min = 999999;
        int total = 0;
        for ( int x : nums ) {
            if (x > max) max = x;
            if (x < min) min = x;
            total += x;
        } return (total - max - min)/(nums.length - 2);
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3, 4, 100};
        int[] bill = {1, 1, 1, 5, 5, 10, 8, 7};
        int[] richard = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(bob) + "...expecting 3");
        System.out.println(centeredAverage(bill) + "...expecting 5");
        System.out.println(centeredAverage(richard) + "...expecting -3");
    }

}
