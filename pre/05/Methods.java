public class Methods {
    public static void main(String[] args) {
        boolean divisibleResult;
        divisibleResult = isDivisible(10, 5);
        System.out.println(divisibleResult);

        boolean triangleResult;
        triangleResult = isTriangle(1, 1, 12);
        System.out.println(triangleResult);

        int ackResult;
        ackResult = ack(1, 1);
        System.out.println(ackResult);
    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(int length1, int length2, int length3) {
        if (length1 + length2 < length3) {
            return false;
        } else if (length2 + length3 < length1) {
            return false;
        } else if (length1 + length3 < length2) {
            return false;
        } else {
            return true;
        }
    }

    public static int ack(int a, int b) {
        isNegError(a);
        isNegError(b);
        if (a == 0) {
            return b + 1;
        } else if (a > 0 && b == 0) {
            return ack(a - 1, 1);
        } else if (a > 0 && b > 0) {
            return ack(a - 1, ack(a, b - 1));
        }
        return -1;
    }

    public static String isNegError(int x){
        if (x < 0) {
            System.err.println("Please input a non-negative value.");
        }
    return null;
    }
}

