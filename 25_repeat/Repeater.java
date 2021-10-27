// MOOV3 (Ziying Jian, Faiza Huda, Emily Ortiz, Kartik Vanjani, Scruffy, Truthful Tom, Applesauce, Krrish)
// APCS
// HW25 -- Do I Repeat Myself?
// 2021-10-26
// time spent: 0.5 hrs

/*
DISCO:
- We can recursively call a method using an if statement
- You can use the int parameter as a counter in the fxn
- In the while loop, the output is concatenated. In the recursive loop, the output is generated starting from the base case.

QCC:
- Do we need to account for negatives? How would we go about doing that?
- How do we account for zero? Is that considered a non-negative?
- Where is the limit for how many fences can be generated?

 */

public class Repeater {

    // while loop
    public static String fenceW(int numPosts) {
        String fenceOutput = "|";
        while( numPosts > 1 ){
            fenceOutput = fenceOutput + "--|";
            numPosts--;
        } return fenceOutput;
    }


    // recursive loop
    public static String fenceR(int numPosts){
        String fenceOutput = "|";
        if (numPosts == 1){
           fenceOutput = "|";
        } else {
            fenceOutput = fenceR(numPosts-1) + "--|";
        } return fenceOutput;
    }


    public static void main(String[] args){

        /* WHILE LOOPS */
        System.out.println(fenceW(1));
        System.out.println(fenceW(2));
        System.out.println(fenceW(4));

        /* RECURSION */
        System.out.println(fenceR(1));
        System.out.println(fenceR(2));
        System.out.println(fenceR(4));
    }
}
