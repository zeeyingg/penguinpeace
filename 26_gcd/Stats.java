// Team Up2U (Ziying Jian, Emily Ortiz, Kartik Vanjani, Scruffy, Applesauce, Krrish)
// APCS
// HW26 -- GCD Three Ways
// 2021-10-26
// time spent: 1 hr

/*
DISCO:
* You always want to be returning or assigning a variable to a recursive call
*  If the base statement in a while loop is false then it does not process
any of the if or else statements that follow and then it just returns what
you tell it to at the end.

QCC:
* Can you initialize a variable using null?
* Which one is better? Iterative or recursive?
* When do you use one over the other?

ALGO:
* The lesser number is divided by the "factor" starting from 1. Everytime the factor is
equally divisible by both numbers, the factor overrides the previous stored value. Once
the factor reaches the value of the lesser number, the factor is returned as the GCD.


* If a number is greater than the other number, keep subtracting the
greater number from the smaller number till they are equal. Once both values are
equal, their value is the GCD.

 */

public class Stats {

    public static int gcd( int a, int b ){
        int i = 1;
        int currentGCD = 1;
        int lesserNum = a;
        if (a > b) {
            lesserNum = b;
        }
        while (i <= lesserNum){
            if ( (a % i == 0) && (b % i == 0)){
                currentGCD = i;
            }
            i++;
        }
        if (a == b) {
            currentGCD = a;
        } return currentGCD;
    }


    public static int gcdER( int a , int b ) {
        if (a > b) {
            return gcdER(a - b, b);
        } else if (a < b) {
            return gcdER(a, b - a);
        } return a;
    }


    public static int gcdEW( int a, int b ){
        while (a != b){
            if (a > b) {
                a-=b; // a = a - b
            } else {
                b-=a;
            }
        } return a;
    }


    public static void main(String[] args){
        System.out.println(gcd(2, 2 ) + "...should be 2");
        System.out.println(gcdER(15, 18 ) + "...should be 3");
        System.out.println(gcdEW(279, 315) + "...should be 9");
    } // end main
} // end class