public class Loops {
    public static void main(String[] args) {
        System.out.println("Power Recursive:");
        System.out.println(powerRecursive(2, 2));

        System.out.println();

        System.out.println("Power Iterative:");
        System.out.println(powerIterative(2, 2));

        System.out.println();

        System.out.println("Factorial Iterative:");
        System.out.println(factorialIterative(3));

        System.out.println();

        System.out.println("myExp");
        System.out.println(myExp(1.0, 4));

        System.out.println();

        System.out.println("check");

        for (double c = -0.1; c >= -100.0; c = c * 10) {
            System.out.println(check(c, 9)); }

        System.out.println(); // line break

        for (double c = 0.1; c <= 100.0; c = c * 10) {
            System.out.println(check(c, 9)); }
    }
        // As the value of x increased by a factor of 10, the digits of agreement decreased.
        // By 100, there was a significant difference between the actual and estimated values.


    // takes double x and an integer n and returns x^n.
    public static double powerRecursive(double x, int n) {
        double value = 0;
        if (n == 0) { // base case
            value = 1;
        } else { // recursive step
            double half = powerRecursive(x, n / 2);
            // calls the function wih the exp being halved
            if (n % 2 == 0) { // even power (i.e. x^8 = x^4 * x^4)
                value = half * half;
            } else { // odd power (i.e. x^9 = x^4 * x^4 * x)
                value = half * half * x;
            }
        }
        return value;
    }

    // exercise 3
    // takes double x and an integer n and returns x^n.
    public static double powerIterative(double x, int n) {
        double result = 1.0;
        if (n >= 0) {
            while (n > 0) { // loops until n = 0
                result = result * x;
                n--; // decrement
            } return result;

        } else {
            while (n < 0) { // accounts for negative exponents
                result = result * (1 / x); // multiplies by the reciprocal of x
                n++; // increment
            }
            return result;
        }
    }

    // exercise 4
    // factorial function (i.e. 4! = 4 * 3 * 2 * 1)
    public static int factorialIterative(int n) {
        int s = 1;
        for (int i = 1; i <= n; i += 1) { // i is a counter here, in the last loop, it's value will be equal to n,
                                            // then it will terminate and return the total
            s = s * i; // replaces s each iteration
        }
        return s;
    }

    // exercise 5.1
    // infinite series expansion (e^x = 1 + x + x^2/2! + x^3/3! + x^4/4!) x^i/i!
    public static double myExp(double x, int i) {
        double result = 1.0;
        int counter = 1;
        while (counter <= i) {
            result = result + powerIterative(x, counter) / factorialIterative(counter);
            // always adds the previous result to current x^i/i!
            counter += 1.0; } // adds 1 to counter
        return result;
    }

    // exercise 5.3
    // generates table
    public static String check(double x, int n) {
        String row = "";
        row = (x + "    " + myExp(x, n) + "    " + Math.exp(x));
        x -= 1;
        return row;
        }
}


