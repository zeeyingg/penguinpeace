public class commonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public static void main(String[] args) {
        int[] bob = {1, 2, 3};
        int[] pop = {7,3};
        int[] bill = {1, 2, 3};
        int[] pill = {7,3, 2};
        int[] richard = {1, 2, 3};
        int[] poorchard = {1, 3};
        System.out.println(commonEnd(bob,pop) + "...expecting true");
        System.out.println(commonEnd(bill, pill) + "...expecting false");
        System.out.println(commonEnd(richard, poorchard) + "...expecting true");
    }
}
