/*

moneyhags, Ziying Jian, Scruffy, Nina Jiang, Alpaca, Faiza Huda, Truthful Tom
APCS
HW10 -- Refactor Big Sib One/Java/Investigating syos
2005-10-04

DISCOVERIES:
- you should change the return type depending on the type of output the method displays
- causes problems to the machine if something is printed out twice -- avoid doing that with the help of return()
- don't need to compile BigSib() as long as you're running main()

UNRESOLVED MYSTERIES:
- Why is main()'s return type void?

*/



public class Greet {
        public static void main (String[] args){
        //      System.out.println("No hablo queso");
                System.out.println(BigSib.greet("Ziying"));
                System.out.println(BigSib.greet("Kartic"));
                System.out.println(BigSib.greet("Ari"));
        }                               

}
