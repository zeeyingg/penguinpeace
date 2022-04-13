// Mister George, Ziying, Diana, Weichen

import java.util.*;
import java.lang.*;

public class Tester{

    public static void main(String[] args){

        ListDeque<String> bob = new ListDeque<String>(); // issues with this line

        // System.out.println("Should throw an IndexOutOfBoundsException...");
        // bob.addFirst("Pamcake");

        for (int i = 0; i < 6; i++){
         bob.addFirst("");   
        }

        System.out.println(bob);
        bob.addFirst("Pamcake");
        bob.addFirst("Vanilla Cake");
        bob.addLast("Cheesecake");
        System.out.println(bob);
        System.out.println();

        System.out.println("...testng peekFirst() and peekLast()");
        System.out.println(bob.peekFirst());
        System.out.println(bob.peekLast());

        System.out.println();
        System.out.println("...testng removeFirst() and removeLast()");
        System.out.println(bob.removeFirst());
        System.out.println(bob.removeLast());
        System.out.println(bob);
    }

}