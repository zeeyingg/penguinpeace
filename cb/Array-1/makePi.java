import java.util.Arrays;
// only needed when running in terminal

public class makePi {
    public static int[] makePi() {
            int[] pi = {3, 1, 4};
            return pi;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makePi()));
    }
}
